package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.request;

import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.Author;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.Book;
import com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model.BookType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CreateBookRequest {
    private String bookName;
    private int cost;
    private BookType type;

    private String bookNo;

    private String authorName;

    private String authorEmail;

    public Book to() {

        Author authorData = Author.builder().
                name(this.authorName).
                email(this.authorEmail).
                build();

        return Book.builder().
                bookNo(this.bookNo).
                name(this.bookName).
                type(this.type).
                cost(this.cost).
                author(authorData)
                .build();
    }
}
