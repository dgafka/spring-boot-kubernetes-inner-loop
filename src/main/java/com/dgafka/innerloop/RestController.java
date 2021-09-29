package com.dgafka.innerloop;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    String[] index() {
        return new String[]{"Hello World!"};
    }
}
