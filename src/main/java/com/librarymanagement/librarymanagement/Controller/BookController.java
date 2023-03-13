package com.librarymanagement.librarymanagement.Controller;

import com.librarymanagement.librarymanagement.Model.Book;
import com.librarymanagement.librarymanagement.Service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    //Entering books REST API
    @PostMapping("/enter")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
    }
    //Get all books REST API
    @GetMapping("/getall")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}