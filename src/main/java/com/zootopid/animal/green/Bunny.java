package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Bunny extends Animal {
    public Bunny() {
        super("Bunny",new Green());
        this.setDescription("The rabbit is a small mammal belonging to the Lagomorpha order. They are known for their long ears, fluffy tails, and fast reproduction rates. Rabbits are herbivores and are found in various habitats worldwide, including forests, grasslands, and urban areas. They are popular as pets and are also raised for their meat, fur, and as laboratory animals.");
        this.setNearby_animals("Fox 90m\n" +
                "Sheep 110m\n" +
                "Hummingbird 70m\n" +
                "Owl 100m\n" +
                "Flamingo 90m");
        this.setAge(1);
        this.setRate(3);
        this.setSize(20);
    }
}
