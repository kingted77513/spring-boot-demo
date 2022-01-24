package com.teddy.springbootdemo.web;

import com.teddy.springbootdemo.domain.dao.entity.Book;
import com.teddy.springbootdemo.domain.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public Object getAll() {
        final Map<String, Object> map = new HashMap<>();
        map.put("name", "Teddy");
        map.put("age", 10);

        return map;
    }

    // 正規表達式: {參數名:正規表達式}
    @GetMapping("/books/{id}/{username}/{phone:[0-9]+}")
    public Object getOne(@PathVariable final long id, @PathVariable("username") final String name,
                         @PathVariable final String phone) {
        final Map<String, Object> book = new HashMap<>();
        book.put("name", name);
        book.put("id", id);
        book.put("isbn", "1241423242");
        book.put("author", "Hello");
        book.put("phone", phone);
        return book;
    }

    @PostMapping("/book")
    public Object post(@RequestParam final String name, @RequestParam final String author,
                       @RequestParam final String ibsn) {
        final Map<String, Object> book = new HashMap<>();
        book.put("name", name);
        book.put("author", author);
        book.put("ibsn", ibsn);

        return book;
    }

    @GetMapping("/v1/books")
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    @PostMapping("/v1/book")
    public Book postBook(@RequestBody final Book book) {
        return bookService.save(book);
    }

    @GetMapping("/v1/book/{id}")
    public Book getBook(@PathVariable final Long id) {
        return bookService.getBook(id);
    }

    @PutMapping("/v1/book")
    public Book putBook(@RequestBody final Book book) {
        return bookService.save(book);
    }

    @DeleteMapping("/v1/book/{id}")
    public String deleteBook(@PathVariable final Long id) {
        bookService.deleteBook(id);
        return "delete book of " + id;
    }

}