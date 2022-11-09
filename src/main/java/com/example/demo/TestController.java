package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lizihao
 * @create 2022/11/9 11:17
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
