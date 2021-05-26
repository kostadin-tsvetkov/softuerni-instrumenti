package com.example.a.projectA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest controller for message generation
@RestController
public class Controller {
    @GetMapping(value = "/")
    public String getMessage() {
        return "Hello, this is a test project for PU";
    }

    @GetMapping(value = "/helloWorld")
    public String getHelloWorldMessage() {
        return "Hello world";
    }
}
