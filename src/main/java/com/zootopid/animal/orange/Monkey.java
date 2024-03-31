package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Monkey extends Animal {
    public Monkey() {
        super("Monkey", new Orange());
        this.setDescription("The monkey is a type of primate found in various parts of the world, known for its agility, intelligence, and social behavior. Monkeys have diverse species and habitats, ranging from tropical forests to savannas. They exhibit a wide range of behaviors, including grooming, communication, and tool usage.");
        this.setNearby_animals("Elephant 80m\n" +
                "Zebra 90m\n" +
                "Kangaroo 90m\n");
        this.setSize(15);
        this.setAge(15);
        this.setRate(3);
    }
}
