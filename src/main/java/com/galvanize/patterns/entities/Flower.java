package com.galvanize.patterns.entities;

import com.galvanize.patterns.enums.PlantType;

public class Flower extends Plant{
    public Flower() {
        super(PlantType.FLOWER);
        sow();
    }
}
