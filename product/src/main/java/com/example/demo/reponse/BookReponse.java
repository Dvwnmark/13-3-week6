package com.example.demo.reponse;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface BookReponse extends JpaRepository<Book, Integer> {

}
