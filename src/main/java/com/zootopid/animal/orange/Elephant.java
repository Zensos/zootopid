package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Elephant extends Animal {
    public Elephant() {
        super("Elephant", new Orange());
        this.setDescription("The elephant is a large mammal that nurtures its young with milk. It possesses a massive and imposing body, with short legs and large ears that serve as important sensory organs, aiding in environmental perception. Elephants exhibit advanced social behaviors and demonstrate intelligence in various activities.");
        this.setNearby_animals("Monkey 80m\n" +
                "Penguin 130m");
        this.setSize(250);
        this.setAge(60);
        this.setRate(4);
    }
}
