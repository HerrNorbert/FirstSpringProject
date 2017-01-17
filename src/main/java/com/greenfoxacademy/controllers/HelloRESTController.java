package com.greenfoxacademy.controllers;

import com.greenfoxacademy.models.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Norbi on 2017. 01. 16..
 */
@RestController
public class HelloRESTController {
    /*@RequestMapping(value="/greeting")
    public Greeting greeting(){
        return new Greeting(1,"Content", "name");
    }*/
    /*@RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name")String name){
        counter.addAndGet(1);
        return new Greeting(1,"Content",name);
    }*/
    AtomicLong counter = new AtomicLong(0);
    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name")String name){
        counter.addAndGet(1);
        return new Greeting("Content",name,counter);
    }

}
