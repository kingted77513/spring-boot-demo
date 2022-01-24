package com.teddy.springbootdemo.domain.service;

import com.teddy.springbootdemo.domain.dao.entity.Book;
import com.teddy.springbootdemo.domain.dao.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book save(final Book book) {
        return bookRepository.save(book);
    }

    public Book getBook(final Long id) {
        return bookRepository.getById(id);
    }

    public void deleteBook(final Long id) {
        bookRepository.deleteById(id);
    }
}
