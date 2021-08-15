package com.teddy.springbootdemo.web;

import com.teddy.springbootdemo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookRestController {

    @Autowired
    private Book book;

    @Value("${book.name}")
    private String nameStr;
    @Value("${book.author}")
    private String authorStr;
    @Value("${book.isbn}")
    private String isbnStr;
    @Value("${book.description}")
    private String description;

    @GetMapping("/books")
    public Object getAll() {
        final Map<String, Object> map = new HashMap<>();
        map.put("name", "Teddy");
        map.put("age", 10);

        return map;
    }

    @GetMapping("/book-help")
    public Object getHelp() {
        final Map<String, Object> map = new HashMap<>();
        map.put("name", nameStr);
        map.put("author", authorStr);
        map.put("isbn", isbnStr);
        map.put("description", description);
        return map;
    }

    @GetMapping("/book-help-object")
    public Book getHelpObject() {
        return book;
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

}