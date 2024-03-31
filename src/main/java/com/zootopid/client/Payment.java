package com.zootopid.client;

public interface Payment {

    public abstract void increment(double amount);
    public abstract void decrement(double amount);

    public abstract void increment(String amount);
    public abstract void decrement(String amount);

}
