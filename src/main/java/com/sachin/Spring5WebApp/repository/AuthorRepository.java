package com.sachin.Spring5WebApp.repository;

import com.sachin.Spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
