package com.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.demo.model.LoginRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody LoginRequest loginRequest) {
        Map<String, Object> response = new HashMap<>();
        
        // Simple hardcoded authentication (for demo purposes only)
        if ("admin".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword())) {
            response.put("success", true);
            response.put("message", "Login successful");
            response.put("token", "demo-jwt-token");
            response.put("user", Map.of(
                "username", "admin",
                "name", "Administrator",
                "role", "ADMIN"
            ));
        } else {
            response.put("success", false);
            response.put("message", "Invalid credentials");
        }
        
        return response;
    }

    @PostMapping("/logout")
    public Map<String, Object> logout() {
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Logout successful");
        return response;
    }
}