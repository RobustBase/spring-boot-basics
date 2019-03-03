package com.robustbase.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class SpringBootBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBasicApplication.class, args);
    }
}
