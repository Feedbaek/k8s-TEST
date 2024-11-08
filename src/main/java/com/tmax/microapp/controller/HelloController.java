package com.tmax.microapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!\n");
    }
}
