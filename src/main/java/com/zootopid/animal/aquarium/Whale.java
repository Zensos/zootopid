package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.BottomRight;

public class Whale extends Animal {
    public Whale() {
        super("Whale", new BottomRight());
        this.setDescription("Whales are large marine mammals belonging to the order Cetacea. They are characterized by their streamlined bodies, blowholes for breathing, and flippers or fins for swimming. Whales are divided into two main groups: baleen whales, which have baleen plates for filter-feeding, and toothed whales, which have teeth for hunting prey. They are found in oceans worldwide and are known for their size, intelligence, and complex social behaviors.");
        this.setNearby_animals("Fishtank 10m\n" +
                "UpperZone 20m\n" +
                "UpperRightZone 20m");
        this.setSize(30);
        this.setAge(27);
        this.setRate(5);
    }
}
