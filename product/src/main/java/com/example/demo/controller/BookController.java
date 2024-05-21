package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.reponse.BookReponse;

@RestController
@RequestMapping("/api/v1")
public class BookController {
	@Autowired
	BookReponse bookReponse;

	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		bookReponse.save(book);
		return book;
	}

	@GetMapping("/book")
	public List<Book> findAll() {
		List<Book> books = new ArrayList<>();
		books = bookReponse.findAll();
		return books;
	}

}
