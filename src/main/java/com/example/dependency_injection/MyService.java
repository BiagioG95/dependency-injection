package com.example.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("Costruttore MyService");
    }

    public String getName() {
        System.out.println("MyService.getName() è stato chiamato");
        return myComponent.getMyComponentName();
    }
}
