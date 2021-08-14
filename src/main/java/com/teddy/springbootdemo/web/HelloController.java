package com.teddy.springbootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    //    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String hello() {
        return "Hello Spring Boot";
    }
    
}
