package com.zootopid.animal;
import com.zootopid.zone.Zone;

public abstract class Animal {
    private String name;
    private Zone zone;

    public Animal() {
        this("", null);
    }

    public Animal(String name, Zone zone) {
        this.name = name;
        this.zone = zone;
    }

    public String getName() {
        return this.name;
    }

    public Zone getZone() {
        return this.zone;
    }

}
