package com.example.keycloak_spring_boot.controller;

import com.example.keycloak_spring_boot.security.MealwurmAuthenticationToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerHello{

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> sayHelloToAdmin() {
        return ResponseEntity.ok("Hello Admin");
    }

    @GetMapping("/user")
    public ResponseEntity<String> sayHelloToUser(final MealwurmAuthenticationToken auth) {
        String userId = auth.getUserId();
        return ResponseEntity.ok("Hello User: " + userId);
    }
}
