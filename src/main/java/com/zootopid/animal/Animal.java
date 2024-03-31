package com.zootopid.animal;
import com.zootopid.zone.Zone;
import java.util.ArrayList;

public abstract class Animal {
    private String name, description, nearby_animals;
    private int size, age, rate;
    private Zone zone;
    public Animal() {
        this("",null);
    }

    public Animal(String name,Zone zone) {
        this.name = name;
        this.zone = zone;
        this.nearby_animals = "";
    }

    public void setNearby_animals(String value) {
        this.nearby_animals = value;
    }

    public String getNearByAnimals() {
       return this.nearby_animals;
    }

    public String getName() {
        return this.name;
    }

    public Zone getZone() {
        return this.zone;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getRate() {
        return rate;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
