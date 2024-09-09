package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Buildpacks!";
    }
}
