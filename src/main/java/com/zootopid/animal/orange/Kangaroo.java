package com.zootopid.animal.orange;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Orange;

public class Kangaroo extends Animal {
    public Kangaroo() {
        super("Kangaroo", new Orange());
        this.setDescription("The kangaroo is a marsupial native to Australia and nearby islands. It is characterized by its powerful hind legs, large tail used for balance, and distinctive method of locomotion - hopping. Kangaroos are herbivorous and are well-adapted to a variety of habitats, ranging from grasslands to forests.");
        this.setNearby_animals("Lion 200m\n" +
                "Tiger 300m\n" +
                "Zebra 130m\n" +
                "Monkey 100m");
        this.setSize(130);
        this.setAge(8);
        this.setRate(2);
    }

}
