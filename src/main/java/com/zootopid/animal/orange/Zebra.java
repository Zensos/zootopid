package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Zebra extends Animal {
    public Zebra() {
        super("Zebra", new Orange());
        this.setDescription("The zebra is a mammal native to Africa known for its distinctive black and white striped coat. They belong to the Equidae family, closely related to horses and donkeys. Zebras are social herbivores typically found in grasslands, savannas, and open woodlands, often forming herds for protection against predators.");
        this.setNearby_animals("Lion 150m\n" +
                "Kangaroo 130m\n" +
                "Monkey 90m\n" +
                "Elephant 150m");
        this.setSize(125);
        this.setAge(25);
        this.setRate(2);
    }
}
