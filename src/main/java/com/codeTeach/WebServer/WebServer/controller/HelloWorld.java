package com.codeTeach.WebServer.WebServer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    //Setup database
    //Connect this to a database and all item and amounts
    //Make Container
    @GetMapping("/hello")
    public String helloWorld(){
        String hello = "Hello";
        return hello;
    }

}
