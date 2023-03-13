package com.librarymanagement.librarymanagement.Repository;

import com.librarymanagement.librarymanagement.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long>{

}
