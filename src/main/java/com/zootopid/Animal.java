package com.zootopid;

public abstract class Animal {
    private String name;

    public Animal() {
        this("");
    }

    public Animal(String name) {
        this.name = name;
    }
}
