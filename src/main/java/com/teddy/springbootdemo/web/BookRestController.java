package com.teddy.springbootdemo.web;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookRestController {
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

}