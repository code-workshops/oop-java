package com.galvanize.patterns.entities;

import com.galvanize.patterns.enums.PlantType;

public class Fungus extends Plant {
    public Fungus() {
        super(PlantType.FUNGUS);
        sow();
    }
}
