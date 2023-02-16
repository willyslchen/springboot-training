package com.willyslchen.springboottraining;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/test")
    public String test() {
        System.out.println("Hi Spring!!");
        return "Hello World!";
    }
}
