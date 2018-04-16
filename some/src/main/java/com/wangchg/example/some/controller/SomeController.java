package com.wangchg.example.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @Value("${my.message}")
    private String message;

    @RequestMapping(value = "/getsome")
    public String getsome() {
        return message;
    }
}
