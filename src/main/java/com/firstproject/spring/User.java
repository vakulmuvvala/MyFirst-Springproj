package com.firstproject.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class User {

    @GetMapping("/")
    public String home() {
        return "Hello, World!";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello, User!";
    }
    @PostMapping("/user")
    public String createUser(@RequestBody UserData userinfo) {
        // Logic to create a user with the provided data
        return "User Created!" +userinfo.getName()+ " "+userinfo.getEmail();
    }

}
