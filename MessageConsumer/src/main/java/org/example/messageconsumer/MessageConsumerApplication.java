package org.example.messageconsumer;

import org.example.helloserviceprovider.HelloImpl;
import org.example.helloserviceprovider.HelloImplService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MessageConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(MessageConsumerApplication.class, args);
        HelloImplService helloService = new HelloImplService();
        HelloImpl hello = helloService.getHelloImplPort();
        System.out.println(hello.sayHello("Rakesh"));
    }

}
