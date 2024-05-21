package com.iuh.requestproductservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.iuh.requestproductservice.dto.BookDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v2")
public class BookController {
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/restbook")
    public BookDto saveBook(@RequestBody BookDto bookDto) {
        String url = "http://localhost:8801/api/v1/book";
        ResponseEntity<BookDto> response = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(bookDto),
                BookDto.class);
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {

            return null;
        }
    }

    @GetMapping("/restbook")
    public List<BookDto> getAll() {
        List<BookDto> bookDtos = new ArrayList<>();
        String url = "http://localhost:8801/api/v1/book";
        ResponseEntity<List<BookDto>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<BookDto>>() {
                });
        if (response.getStatusCode() == HttpStatus.OK) {
            bookDtos = response.getBody();
        }
        return bookDtos;
    }
}
