package com.dgafka.innerloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class InnerLoopApplication {

    public static void main(String[] args) {
        SpringApplication.run(InnerLoopApplication.class, args);
    }
}

@RestController
class Controller {
    @GetMapping("/")
    String[] index() {
        return new String[]{"Cricket", "Basketball", "Football", "Badminton", "RabbitMQ", "RabbitMQ"};
    }
}