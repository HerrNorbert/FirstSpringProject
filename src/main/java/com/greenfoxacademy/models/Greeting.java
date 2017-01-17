package com.greenfoxacademy.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Norbi on 2017. 01. 16..
 */
@Getter
@AllArgsConstructor
public class Greeting {

   // private long id;
    private String Content, name;
    private AtomicLong id;

}
