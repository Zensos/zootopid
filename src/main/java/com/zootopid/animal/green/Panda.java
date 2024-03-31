package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Panda extends Animal {
    public Panda() {
        super("Panda", new Green());
        this.setDescription("The panda, also known as the giant panda, is a large bear native to China. It is famous for its distinctive black and white fur pattern, large size, and gentle demeanor. Pandas are primarily herbivorous, feeding almost exclusively on bamboo, and are symbols of conservation efforts worldwide.");
        this.setNearby_animals("Deer 50m\n" +
                "Sheep 60m\n" +
                "Fox 100m");
        this.setSize(60);
        this.setAge(20);
        this.setRate(5);
    }
}
