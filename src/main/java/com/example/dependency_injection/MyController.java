package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class MyController {
    @Autowired
    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("Costruttore MyController");
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Benvenuto nella mia applicazione Spring Boot!";
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }
}
