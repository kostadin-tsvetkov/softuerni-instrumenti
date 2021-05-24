package com.example.a.projectA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/")
    public String getMessage() {
        return "Hello";
    }

    @GetMapping(value = "/helloWorld")
    public String getHelloWorldMessage() {
        return "Hello world";
    }
}
