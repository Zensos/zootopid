package com.example.zootopid;

import java.util.Date;

public class Reward {

    private  String name;
    private String type;
    private double amount;
    private Date date;

    public Reward(String type, double amount, Date date) {
        this.setType(type);
        this.setAmount(amount);
        this.setDate(date);
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
