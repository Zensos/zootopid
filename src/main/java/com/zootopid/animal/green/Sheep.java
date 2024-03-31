package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Sheep extends Animal {
    public Sheep() {
        super("Sheep", new Green());
        this.setDescription("The sheep is a domesticated ruminant mammal known for its woolly coat and herbivorous diet. Sheep are raised worldwide for their wool, meat, and milk. They are social animals that typically form flocks and are often managed by humans for agricultural purposes.");
        this.setNearby_animals("Deer 50m\n" +
                "Panda 60m\n" +
                "Fox 100m\n" +
                "Rabbit 110m\n" +
                "Hummingbird 60m");
        this.setSize(80);
        this.setAge(10);
        this.setRate(2);
    }
}
