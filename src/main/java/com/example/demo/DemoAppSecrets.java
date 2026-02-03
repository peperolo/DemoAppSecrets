package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoAppSecrets {
    public static void main(String[] args) {
        SpringApplication.run(DemoAppSecrets.class, args);
    }

    @RestController
    class SecretController {
        @Value("${DB_USER}")
        private String user;

        @Value("${DB_PASS}")
        private String pass;

        @GetMapping("/secret")
        public String showSecret() {
            return "Usuario: " + user + ", Pass: " + pass;
        }
    }
}
