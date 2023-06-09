package com.librarymanagement.librarymanagement.Serviceimpl;



import com.librarymanagement.librarymanagement.Exception.ResourceNotFoundExecption;
import com.librarymanagement.librarymanagement.Model.Book;
import com.librarymanagement.librarymanagement.Repository.BookRepository;
import com.librarymanagement.librarymanagement.Service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Book getBookById(long id) throws ResourceNotFoundExecption {
        Optional<Book> book = bookRepository.findById(id);

        if (book.isPresent()){
            return book.get();
        }else {
            throw new ResourceNotFoundExecption("Book", "Id", id);
        }
    }

    @Override
    public Book updateBook(Book book, long id) throws ResourceNotFoundExecption {
        Book existingBook = bookRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundExecption("Book", "Id", id));
        existingBook.setBookISBN(book.getBookISBN());
        existingBook.setBookName(book.getBookName());
        existingBook.setBookAuthor(book.getBookAuthor());
        bookRepository.save(existingBook);
        return existingBook;
    }

    @Override
    public void deleteBook(long id) throws ResourceNotFoundExecption {
        bookRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundExecption("Book", "Id", id));
        bookRepository.deleteById(id);
    }


}
