package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.controller;

import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public void create(@RequestBody CreateBookRequest createBookRequest) {
        bookService.create(createBookRequest);
    }
}
