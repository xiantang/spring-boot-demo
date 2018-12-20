package com.example.springinaction.springboot.controller;

import com.example.springinaction.springboot.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
//@RequestMapping(value ="/user")
public class MyRestController {

//    @RequestMapping(value = "/{user}",method = RequestMethod.GET)
//    public String getUser(@PathVariable Long user){
//        return "asdasdsa";
//
//    }
    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/gretting",method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name){
        return new Greeting(counter.incrementAndGet(), String.format(name));

    }


}
