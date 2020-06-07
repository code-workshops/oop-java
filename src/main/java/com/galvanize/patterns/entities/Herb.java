package com.galvanize.patterns.entities;

import com.galvanize.patterns.enums.PlantType;

public class Herb extends Plant {
    public Herb() {
        super(PlantType.HERB);
        sow();
    }
}
