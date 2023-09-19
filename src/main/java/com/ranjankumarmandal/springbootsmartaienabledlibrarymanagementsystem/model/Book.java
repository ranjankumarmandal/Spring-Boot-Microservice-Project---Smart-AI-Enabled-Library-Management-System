package com.ranjankumarmandal.springbootsmartaienabledlibrarymanagementsystem.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    private String name;

    private int cost;

    @JoinColumn
    @ManyToOne
    private Author author;

    private String bookNo;

    @Enumerated(value = EnumType.STRING)
    private BookType type;

    @JoinColumn
    @ManyToOne
    private Student student;
}
