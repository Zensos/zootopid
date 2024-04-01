package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.TopLeft;

public class Shark extends Animal {
    public Shark() {
        super("Shark", new TopLeft());
        this.setDescription("Sharks are a diverse group of cartilaginous fish found in oceans worldwide. They are characterized by their streamlined bodies, sharp teeth, and powerful jaws. Sharks play a crucial role in marine ecosystems as top predators, helping to maintain the balance of oceanic food webs. They come in various shapes and sizes, ranging from small species like the dwarf lanternshark to large apex predators like the great white shark.");
        this.setNearby_animals("Fishtank 20m\n" +
                "UpperRightZone 5m\n" +
                "ShowZone 20m");
        this.setSize(12);
        this.setAge(21);
        this.setRate(5);
    }
}
