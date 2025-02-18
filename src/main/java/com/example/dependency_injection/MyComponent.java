package com.example.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private final String myComponentName;

    public MyComponent() {
        this.myComponentName =  "My Component";
        System.out.println("Costruttore MyComponent");
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() è stato chiamato");
        return myComponentName;
    }


}
