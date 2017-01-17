package com.greenfoxacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Controller
public class StartSpringApplication {

	/*@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(){return "Hello world";}*/
	public static void main(String[] args) {
		SpringApplication.run(StartSpringApplication.class, args);
	}
}
