package com.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.demo.model.DashboardData;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "http://localhost:4200")
public class DashboardController {

    @GetMapping("/data")
    public DashboardData getDashboardData() {
        return new DashboardData();
    }

    @GetMapping("/stats")
    public Map<String, Object> getStats() {
        return Map.of(
            "totalSales", 1254,
            "newCustomers", 342,
            "pendingOrders", 28,
            "conversionRate", 68.5
        );
    }
}