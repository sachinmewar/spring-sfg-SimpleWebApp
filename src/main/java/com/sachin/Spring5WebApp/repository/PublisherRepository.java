package com.sachin.Spring5WebApp.repository;

import com.sachin.Spring5WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
