package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.BottomLeft;

public class JellyFish extends Animal {
    public JellyFish() {
        super("JellyFish", new BottomLeft());
        this.setDescription("Jellyfish are gelatinous marine creatures belonging to the phylum Cnidaria. They are characterized by their translucent, umbrella-shaped bell and trailing tentacles equipped with stinging cells. Jellyfish inhabit oceans worldwide and play important roles in marine ecosystems as both predators and prey. They come in a variety of shapes, sizes, and colors, ranging from tiny to large, and some species are bioluminescent.");
        this.setNearby_animals("Octopus\n" +
                "Upper Zone 20m\n" +
                "Upper Right Zone 20m\n" +
                "Show Zone 10m");
        this.setSize(0);
        this.setAge(0);
        this.setRate(3);
    }
}
