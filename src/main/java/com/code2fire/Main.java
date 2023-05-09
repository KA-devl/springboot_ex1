package com.code2fire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class Main {
    public static void main(String[] args) {
        System.out.println("Running application!");
        SpringApplication.run(Main.class, args);
    }
    @GetMapping("/")
    public Greetings hello() {
        return new Greetings("Hello World!");
    }

    record Greetings(String message) {}
}
