package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// belong to
@RestController // tells Spring to render the resulting string directly back to the caller.
@EnableAutoConfiguration
public class HelloController {



    @RequestMapping("/") // provides “routing” information
    public String say(){
        return "Hello world";
    }


}
