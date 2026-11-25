package com.example;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component 
public class Lifecycle {
    Lifecycle()
    {
        System.out.println("this is Lifecycle constructor");
    }

    @PostConstruct
    public void first()
    {
        System.out.println("this is post construct and it runs automaticall when object creats..");
    }

    @PreDestroy
    public void end()
    {
        System.out.println("this is pre destroy run before context close");
    }
}
