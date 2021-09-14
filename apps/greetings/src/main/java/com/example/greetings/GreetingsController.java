package com.example.greetings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @Value("${GREETING_PREFIX:Hello}")
    private String greetingPrefix;

    @GetMapping("/greet")
    public String Greet(String name) {
        return String.format("%s %s.", greetingPrefix, name);
    }
}
