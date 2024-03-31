package com.zootopid.animal.red;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Red;

public class Hippo extends Animal {
    public Hippo() {
        super("Hippo", new Red());
        this.setDescription("The hippopotamus, often referred to as a hippo, is a large mammal native to sub-Saharan Africa. It is characterized by its massive size, barrel-shaped body, short legs, and large mouth revealing formidable tusks. Hippos spend much of their time in water, where they are excellent swimmers despite their bulk, and are considered one of the most dangerous animals in Africa.\n");
        this.setNearby_animals("Flamingo 100m\n" +
                "Rabbit 150m\n" +
                "Owl 150m\n" +
                "Crocodile 250m");
        this.setSize(155);
        this.setAge(50);
        this.setRate(3);
    }
}
