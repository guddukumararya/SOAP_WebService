package org.example.helloserviceprovider;

import jakarta.xml.ws.Endpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceProviderApplication.class, args);
		Endpoint.publish("http://localhost:8080/helloserviceprovider/hello", new HelloImpl());
	}

}
