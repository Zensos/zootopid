package com.zootopid.animal.red;

import com.zootopid.animal.Animal;
import com.zootopid.zone.Red;

public class Flamingo extends Animal {
    public Flamingo() {
        super("Flamingo", new Red());
        this.setDescription("The flamingo is a type of wading bird known for its long legs, distinctive pink plumage, and unique S-shaped neck. They are often found in large flocks in wetland habitats, where they feed by filter-feeding on small organisms in shallow water. Flamingos are famous for their vibrant appearance and graceful movements.");
        this.setNearby_animals("Hippo 100m\n" +
                "Fox 100m\n" +
                "Rabbit 90m");
        this.setSize(130);
        this.setAge(25);
        this.setRate(4);
    }
}
