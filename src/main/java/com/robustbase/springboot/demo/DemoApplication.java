package com.robustbase.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public @ResponseBody
    String greet() {
        String Failure_URL = UriComponentsBuilder.newInstance()
                .scheme("https").host("www.google.com")
                .queryParam("error_code", "error_code_value")
                .queryParam("description", "description_value")
                .build().toUriString();
        System.out.println(Failure_URL);
        return "Good morning...";
    }

    @GetMapping("/{name}")
    public @ResponseBody
    String greetMe(@PathVariable String name) {
        return "Good morning..." + name;
    }

    @PostMapping("/{name}")
    public void logMe(@PathVariable String name) {

        System.out.println(name);
    }
}
