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
    @Column(name="book_ISBN", nullable = false)
    private String bookISBN;
    @Column(name="book_author", nullable = false)
    private String bookAuthor;
    @Column(name="book_out")
    private Date bookOut;
    @Column(name="book_in")
    private Date bookIn;
}
