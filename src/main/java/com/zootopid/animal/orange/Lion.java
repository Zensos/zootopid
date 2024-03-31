package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Lion extends Animal {
    public Lion() {
        super("Lion", new Orange());
        this.setDescription("The lion is a mammal belonging to the Felidae family and is one of the four big cats in the genus Panthera, along with the tiger, leopard, and jaguar. It is the largest of the big cats and is found mainly in Africa, symbolizing the majesty of wildlife.");
        this.setNearby_animals("TIger 100m\n" +
                "Kangaroo 200m\n" +
                "Owl 150m\n" +
                "Bird 200m");
        this.setSize(150);
        this.setAge(11);
        this.setRate(5);
    }
}
