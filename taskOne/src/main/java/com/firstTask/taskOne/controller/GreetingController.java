package com.firstTask.taskOne.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greet")
    public String greet(@RequestParam String name){

        return "Hello, " + name;
    }

    @PostMapping("/farewell")
    public String farewell(@RequestBody String name){
        
        return "farewell, " + name;
    }
}

