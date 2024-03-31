package com.zootopid.animal.blue;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Blue;

public class PolarBear extends Animal {
    public PolarBear() {
        super("PolarBear", new Blue());
        this.setDescription("The polar bear is a large carnivorous mammal native to the Arctic region. It is well-adapted to its icy habitat, with a thick layer of insulating fat and water-repellent fur. Polar bears are powerful swimmers and expert hunters, primarily preying on seals. They are considered apex predators in their ecosystem and play a crucial role in maintaining the Arctic food web.");
        this.setNearby_animals("Seal 200m");
        this.setSize(142);
        this.setAge(27);
        this.setRate(5);
    }
}
