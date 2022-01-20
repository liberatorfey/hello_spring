package com.hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloTest {

    @GetMapping
    public String helloTest(){
        return "Hello World";
    }
}
