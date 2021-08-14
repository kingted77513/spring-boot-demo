package com.teddy.springbootdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @GetMapping("/books")
    public String getAll(){
        return "books";
    }

    @GetMapping("/book")
    @ResponseBody
    public String getOne(){
        return "book";
    }
}