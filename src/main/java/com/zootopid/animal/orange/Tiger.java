package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Tiger extends Animal {
    public Tiger() {
        super("Tiger", new Orange());
        this.setDescription("The tiger is a large carnivorous mammal belonging to the Felidae family. It is known for its distinctive orange coat with black stripes and is one of the apex predators in its habitat, symbolizing strength and power.");
        this.setNearby_animals("Lion 100m\n" +
                "Zebra 150m\n" +
                "Crocodile 100m\n" +
                "Kangaroo 300m\n" +
                "Owl 150m");
        this.setSize(90);
        this.setAge(10);
        this.setRate(4);
    }
}
