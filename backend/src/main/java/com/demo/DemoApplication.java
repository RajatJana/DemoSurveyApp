package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; // 👈 Import this

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer { // 👈 Add this part

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}