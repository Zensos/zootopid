package com.zootopid.animal.blue;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Blue;

public class Seal extends Animal {
    public Seal() {
        super("Seal", new Blue());
        this.setDescription("Seals are marine mammals adapted to life both in the water and on land. They have streamlined bodies, flipper-like limbs, and thick layers of blubber for insulation. Seals are carnivorous and primarily feed on fish, squid, and crustaceans. They are found in oceans worldwide and are known for their playful behavior both in and out of the water.\n");
        this.setNearby_animals("Polar bear 200m\n" +
                "Crocodile 110m\n" +
                "Penguin 500m");
        this.setSize(175);
        this.setAge(16);
        this.setRate(5);
    }
}
