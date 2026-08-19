package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

    @GetMapping("/api/users")
    public String user(){
        return "user reg";
    }
}
