package com.librarymanagement.librarymanagement.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="book_name", nullable = false)
    private String bookName;
    @Column(name="book_ISBN")
    private String bookISBN;
    @Column(name="book_author")
    private String bookAuthor;
}
