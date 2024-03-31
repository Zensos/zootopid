package com.zootopid.animal.red;

import com.zootopid.animal.Animal;
import com.zootopid.animal.orange.Elephant;
import com.zootopid.zone.Red;

public class Crocodile extends Animal {
    public Crocodile() {
        super("Crocodile", new Red());
        this.setDescription("The crocodile is a large reptile found in tropical regions across the world. It is characterized by its long, powerful body, armored skin, and formidable jaws filled with sharp teeth. Crocodiles are expert predators, often hunting near water sources, and are known for their ability to ambush prey.");
        this.setNearby_animals("Hippo 250m\n" +
                "Seal 110m\n" +
                "Tiger 100m");
        this.setSize(250);
        this.setAge(45);
        this.setRate(3);
    }
}
