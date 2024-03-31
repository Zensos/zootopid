package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.BottomLeft;

public class Nemo extends Animal {
    public Nemo() {
        super("Nemo", new BottomLeft());
        this.setDescription("Nemo are a diverse group of marine fish found in oceans worldwide. While not specifically identified as \"Nemo\" like the clownfish species, they share similar characteristics such as vibrant colors, unique patterns, and fascinating behaviors. These fish come in various shapes and sizes, contributing to the biodiversity and beauty of coral reef ecosystems.");
        this.setNearby_animals("Jellyfish\n" +
                "Octopus\n" +
                "Upper Zone 20m\n" +
                "Upper Right Zone 20m\n" +
                "Show Zone 10m");
        this.setSize(10);
        this.setAge(10);
        this.setRate(5);
    }
}
