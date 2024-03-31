package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Deer extends Animal {
    public Deer() {
        super("Deer", new Green());
        this.setDescription("The deer is a hoofed mammal belonging to the family Cervidae, known for its slender body, long legs, and antlers (in males of most species). Deer are herbivores and are found in various habitats worldwide, including forests, grasslands, and tundra. They are valued for their beauty and are often hunted for sport and meat.\n");
        this.setNearby_animals("Panda 50m\n" +
                "Sheep 50m\n");
        this.setSize(120);
        this.setAge(5);
        this.setRate(2);
    }
}
