package com.galvanize.patterns.entities;

import com.galvanize.patterns.enums.PlantType;
import com.galvanize.patterns.interfaces.BasePlant;

public class Plant implements BasePlant {
    public String name;
    private PlantType type;

    public Plant(PlantType type) {
        this.type = type;
    }

    public void sow() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlantType getType() {
        return type;
    }
}
