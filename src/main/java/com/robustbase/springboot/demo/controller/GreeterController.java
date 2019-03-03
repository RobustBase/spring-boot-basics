package com.robustbase.springboot.demo.controller;

import com.robustbase.springboot.demo.model.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeters")
public class GreeterController {

    private final Greeter greeter;

    public GreeterController(Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping(value = "/greet-me")
    public String greetMe() {
        return greeter.getGreeting();
    }
}
