package com.demo.model;

import java.util.Arrays;
import java.util.List;

public class DashboardData {
    private String welcomeMessage;
    private int totalUsers;
    private double revenue;
    private List<String> recentActivities;
    private List<ChartData> chartData;

    public DashboardData() {
        this.welcomeMessage = "Welcome to your Dashboard!";
        this.totalUsers = 1542;
        this.revenue = 125430.75;
        this.recentActivities = Arrays.asList(
            "User John Doe registered",
            "Payment received from Jane Smith",
            "New product launched",
            "System maintenance completed"
        );
        this.chartData = Arrays.asList(
            new ChartData("Jan", 100),
            new ChartData("Feb", 150),
            new ChartData("Mar", 200),
            new ChartData("Apr", 180),
            new ChartData("May", 250),
            new ChartData("Jun", 300)
        );
    }

    // Getters and Setters
    public String getWelcomeMessage() { return welcomeMessage; }
    public void setWelcomeMessage(String welcomeMessage) { this.welcomeMessage = welcomeMessage; }
    
    public int getTotalUsers() { return totalUsers; }
    public void setTotalUsers(int totalUsers) { this.totalUsers = totalUsers; }
    
    public double getRevenue() { return revenue; }
    public void setRevenue(double revenue) { this.revenue = revenue; }
    
    public List<String> getRecentActivities() { return recentActivities; }
    public void setRecentActivities(List<String> recentActivities) { this.recentActivities = recentActivities; }
    
    public List<ChartData> getChartData() { return chartData; }
    public void setChartData(List<ChartData> chartData) { this.chartData = chartData; }

    public static class ChartData {
        private String month;
        private int value;

        public ChartData(String month, int value) {
            this.month = month;
            this.value = value;
        }

        // Getters and Setters
        public String getMonth() { return month; }
        public void setMonth(String month) { this.month = month; }
        
        public int getValue() { return value; }
        public void setValue(int value) { this.value = value; }
    }
}