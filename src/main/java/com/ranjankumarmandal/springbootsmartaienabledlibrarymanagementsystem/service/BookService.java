package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.service;

import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.Author;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.Book;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.repository.AuthorRepository;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.repository.BookRepository;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public void create(CreateBookRequest createBookRequest) {
        Book book = createBookRequest.to();
        Author authorFromDB = authorRepository.findByEmail(book.getAuthor().getEmail());

        if(authorFromDB == null) {
            authorFromDB = authorRepository.save(book.getAuthor());
        }

        bookRepository.save(book);
    }
}
