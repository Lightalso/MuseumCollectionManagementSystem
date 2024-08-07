package com.lightalso.museum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default_user")
public class DefaultUserRestController {
    @GetMapping("/test")
    public String test() {
        System.out.println("test");
        return "test";
    }
}
