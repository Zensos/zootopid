package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.BottomRight;

public class Dolphin extends Animal {
    public Dolphin() {
        super("Dolphin", new BottomRight());
        this.setDescription("Dolphins are highly intelligent marine mammals belonging to the family Delphinidae. They are characterized by their streamlined bodies, curved dorsal fins, and playful behavior. Dolphins are known for their strong social bonds, complex communication skills, and acrobatic displays. They are found in oceans worldwide and are carnivorous, feeding primarily on fish and squid.");
        this.setNearby_animals("Fish tank 10m\n" +
                "Upper Zone 20m\n" +
                "Upper Right Zone 20m");
        this.setSize(1);
        this.setAge(19);
        this.setRate(4);
    }
}
