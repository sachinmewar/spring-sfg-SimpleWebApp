package com.sachin.Spring5WebApp.controller;

import com.sachin.Spring5WebApp.domain.Book;
import com.sachin.Spring5WebApp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBook(Model model) {

        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
