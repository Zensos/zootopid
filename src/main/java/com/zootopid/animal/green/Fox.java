package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Fox extends Animal {
    public Fox() {
        super("Fox", new Green());
        this.setDescription("The fox is a small to medium-sized mammal belonging to the Canidae family. It is known for its slender body, pointed muzzle, bushy tail, and often red or orange fur. Foxes are highly adaptable and can be found in various habitats worldwide, including forests, grasslands, and urban areas.");
        this.setNearby_animals("Panda 100m\n" +
                "Sheep 100m\n" +
                "Rabbit 90m");
        this.setSize(30);
        this.setRate(3);
        this.setAge(4);
    }

}
