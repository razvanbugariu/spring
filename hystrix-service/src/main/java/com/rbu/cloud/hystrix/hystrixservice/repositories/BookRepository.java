package com.rbu.cloud.hystrix.hystrixservice.repositories;

import com.rbu.cloud.hystrix.hystrixservice.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAll();

    List<Book> findByAuthor(String author);

    Book findByTitle(String title);
}
