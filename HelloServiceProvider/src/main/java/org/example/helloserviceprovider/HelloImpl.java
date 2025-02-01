package org.example.helloserviceprovider;

import jakarta.jws.WebService;

@WebService
public class HelloImpl implements Hello {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
