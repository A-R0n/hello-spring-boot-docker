package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/demo/hello")
public class HelloBBVA {

    @GetMapping
    public String hello () {
        return "Hello BBVA";
    }
}
