package com.github.delve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.delve.*")
public class App extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }
}
