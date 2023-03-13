package com.librarymanagement.librarymanagement.Serviceimpl;



import com.librarymanagement.librarymanagement.Model.Book;
import com.librarymanagement.librarymanagement.Repository.BookRepository;
import com.librarymanagement.librarymanagement.Service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIMPL implements BookService {

    private BookRepository bookRepository;

    public BookServiceIMPL(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}