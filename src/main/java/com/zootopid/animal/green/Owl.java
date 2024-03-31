package com.zootopid.animal.green;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Green;

public class Owl extends Animal {
    public Owl() {
        super("Owl",new Green());
        this.setDescription("Owls are birds of prey characterized by their upright stance, large heads with forward-facing eyes, and sharp, hooked beaks. They are nocturnal hunters with silent flight, enabling them to capture prey efficiently. Owls are found in various habitats worldwide, including forests, grasslands, and deserts.");
        this.setNearby_animals("Hummingbird 50m\n" +
                "Rabbit 100m\n" +
                "Tiger 100m\n" +
                "Lion 150m");
        this.setSize(30);
        this.setAge(4);
        this.setRate(3);
    }
}
