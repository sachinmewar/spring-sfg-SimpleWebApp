package com.sachin.Spring5WebApp.repository;

import com.sachin.Spring5WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
