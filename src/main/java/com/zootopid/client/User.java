package com.zootopid.client;


public class User implements Payment {
    private String username;
    private String password;
    private String tel;
    private int point = 10000;
    private String role;

    public User(String username, String password, String tel, String role) {
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.role = role;
    }

    public int getPoint() {
        return this.point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void increment(double amount) {
        this.point += amount;
    }

    @Override
    public void decrement(double amount) {
        this.point -= amount;
    }

    @Override
    public void increment(String amount) {
        this.point += Double.parseDouble(amount);
    }

    @Override
    public void decrement(String amount) {
        this.point -= Double.parseDouble(amount);
    }
}

