package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.BottomLeft;

public class Octopus extends Animal {
    public Octopus() {
        super("Octopus", new BottomLeft());
        this.setDescription("The octopus is a highly intelligent marine mollusk belonging to the class Cephalopoda. It is characterized by its soft, elongated body, eight arms lined with suckers, and a bulbous head. Octopuses are known for their remarkable problem-solving abilities, camouflage skills, and complex behaviors. They are found in oceans worldwide, inhabiting various habitats from coral reefs to deep-sea trenches.");
        this.setNearby_animals("Jellyfish\n" +
                "Upper Zone 20m\n" +
                "Upper Right Zone 20m\n" +
                "Show Zone 10m");
        this.setSize(0);
        this.setAge(0);
        this.setRate(4);
    }
}
