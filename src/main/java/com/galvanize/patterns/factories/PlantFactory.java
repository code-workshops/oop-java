package com.galvanize.patterns.factories;

import com.galvanize.patterns.entities.Flower;
import com.galvanize.patterns.entities.Fungus;
import com.galvanize.patterns.entities.Herb;
import com.galvanize.patterns.entities.Plant;
import com.galvanize.patterns.enums.PlantType;

public class PlantFactory {
    public static Plant create(PlantType pType) {
        Plant plant = null;
        switch (pType) {
            case FLOWER:
                plant = new Flower();
                break;
            case HERB:
                plant = new Herb();
                break;
            case FUNGUS:
                plant = new Fungus();
                break;
            default:
                break;
        }
        return plant;
    }
}
