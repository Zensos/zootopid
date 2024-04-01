package com.zootopid.animal.aquarium;

import com.zootopid.animal.Animal;
import com.zootopid.zone.aquarium.TopRight;

public class Turtle extends Animal {
    public Turtle() {
        super("Turtle", new TopRight());
        this.setDescription("Sea turtles are large marine reptiles characterized by their streamlined bodies, flipper-like limbs, and hard, bony shells. They are well-adapted for life in the ocean and can be found in all oceans except the Arctic and Antarctic. Sea turtles are known for their long migrations, with females returning to their natal beaches to lay eggs. They play important roles in marine ecosystems as predators and help maintain the health of coral reefs and seagrass beds.");
        this.setNearby_animals("Fishtank 20m\n" +
                "UpperZone 5m\n" +
                "ShowZone 20m");
        this.setSize(2);
        this.setAge(32);
        this.setRate(5);
    }
}
