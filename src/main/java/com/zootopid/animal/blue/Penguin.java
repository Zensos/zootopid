package com.zootopid.animal.blue;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Blue;

import java.lang.reflect.Array;

public class Penguin extends Animal {
    public Penguin() {
        super("Penguin", new Blue());
        this.setDescription("Penguins are flightless birds that are highly adapted to life in the water. They have streamlined bodies, flipper-like wings, and thick layers of insulating feathers. Penguins are excellent swimmers and primarily feed on fish and krill. They are found primarily in the Southern Hemisphere, with some species also inhabiting parts of the Northern Hemisphere.");
        this.setNearby_animals("Elephant 130m\n" +
                "Seal 500m");
        this.setSize(51);
        this.setAge(15);
        this.setRate(5);
    }
}
