package com.pmanaktala.zippingservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("hello-world")
    ResponseEntity<String>  helloWorld(){
        return new ResponseEntity("Hello World", HttpStatus.OK);
    }
}
