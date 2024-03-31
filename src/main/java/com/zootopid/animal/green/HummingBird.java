package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class HummingBird extends Animal {

    public HummingBird() {
        super("HummingBird", new Green());
        this.setDescription("The hummingbird is a small bird known for its remarkable hovering ability, rapid wing beats, and vibrant iridescent plumage. They are found only in the Americas and are characterized by their long, slender bills adapted for feeding on nectar from flowers. Hummingbirds are among the smallest birds and are admired for their agility and beauty.");
        this.setNearby_animals("Owl 50m\n" +
                "Rabbit 70m\n" +
                "Sheep 60m\n" +
                "Lion 200m");
        this.setSize(6);
        this.setAge(2);
        this.setRate(5);
    }
}
