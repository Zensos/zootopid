package com.zootopid.animal.red;

import com.zootopid.animal.Animal;
import com.zootopid.animal.orange.Elephant;
import com.zootopid.zone.Red;

public class Crocodile extends Animal {
    public Crocodile() {
        super("Crocodile", new Red());
        this.addNearByAnimals("Elephant", 10);
        this.addNearByAnimals("Frog", 20);
        System.out.println(this.getNearByAnimals());
    }
}
