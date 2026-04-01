package com.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Access this at http://localhost:8080/greet
    @GetMapping("/greet")
    public String sayHello() {
        return "Hello! Welcome to your Spring Boot application.";
    }

    // Access this at http://localhost:8080/hello?name=User
    @GetMapping("/hello")
    public String personalizedHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }
}