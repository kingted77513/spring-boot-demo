package com.teddy.springbootdemo.web;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String hello(){
        return "Hello Spring Boot";
    }

    @PostMapping(value = "/books")
    public String books(){
        return "books";
    }

}
