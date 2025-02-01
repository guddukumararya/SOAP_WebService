package org.example.helloserviceprovider;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface Hello {
    @WebMethod
    String sayHello(String name);
}
