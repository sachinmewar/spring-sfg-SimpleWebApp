package com.sachin.Spring5WebApp.bootstrap;

import com.sachin.Spring5WebApp.domain.Author;
import com.sachin.Spring5WebApp.domain.Book;
import com.sachin.Spring5WebApp.repository.AuthorRepository;
import com.sachin.Spring5WebApp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author sachin = new Author( "Sachin", "Mewar");
        Book book = new Book("Book", "3122342323421");

        sachin.getBooks().add(book);
        book.getAuthors().add(sachin);

        authorRepository.save(sachin);
        bookRepository.save(book);

        Author honey = new Author( "Honey", "Mewar");
        Book javaBook = new Book("Java Master", "2134312312321");
        honey.getBooks().add(javaBook);
        book.getAuthors().add(honey);

        authorRepository.save(honey);
        bookRepository.save(javaBook);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books : " + bookRepository.count());
        System.out.println("Number of Authors : " + authorRepository.count());
    }
}
