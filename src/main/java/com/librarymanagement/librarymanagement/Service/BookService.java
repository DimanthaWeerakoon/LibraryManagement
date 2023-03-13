package com.librarymanagement.librarymanagement.Service;

import com.librarymanagement.librarymanagement.Exception.ResourceNotFoundExecption;
import com.librarymanagement.librarymanagement.Model.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(long id) throws ResourceNotFoundExecption;
};
