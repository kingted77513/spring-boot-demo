package com.teddy.springbootdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot";
    }

}
