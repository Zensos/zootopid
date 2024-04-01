package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.TopRight;

public class PufferFish extends Animal {
    public PufferFish() {
        super("PufferFish", new TopRight());
        this.setDescription("Pufferfish, also known as blowfish or fugu, are a group of fish belonging to the family Tetraodontidae. They are characterized by their ability to inflate their bodies with water or air when threatened, turning into a round, spiky shape as a defense mechanism. Pufferfish are found in tropical and subtropical oceans worldwide and are known for their toxin, tetrodotoxin, which can be deadly if ingested in sufficient quantities.");
        this.setNearby_animals("Octopus 30m\n" +
                "UpperZone 20m\n" +
                "UpperRightZone 20m\n" +
                "ShowZone 10m");
        this.setSize(50);
        this.setAge(4);
        this.setRate(2);
    }
}
