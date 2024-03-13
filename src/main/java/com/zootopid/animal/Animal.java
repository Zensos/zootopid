package com.zootopid.animal;
import com.zootopid.zone.Zone;
import java.util.ArrayList;

public abstract class Animal {
    private String name, description, nearby_animals;
    private Zone zone;
    public Animal() {
        this("", null);
    }

    public Animal(String name, Zone zone) {
        this.name = name;
        this.zone = zone;
        this.nearby_animals = "";
    }

    public void addNearByAnimals(String anm_name, double range) {
        this.nearby_animals += anm_name + "         " + range + "\n";
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
}
