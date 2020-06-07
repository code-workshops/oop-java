import com.galvanize.patterns.entities.Plant;
import com.galvanize.patterns.enums.PlantType;
import com.galvanize.patterns.factories.PlantFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantsTestCase {
    @Test
    void testCreateFlower() {
        Plant plant = PlantFactory.create(PlantType.FLOWER);
        assertNotNull(plant);
        assertEquals(plant.getType(), PlantType.FLOWER);
    }

    @Test
    void testCreateHerb() {
        Plant plant = PlantFactory.create(PlantType.HERB);
        assertNotNull(plant);
        assertEquals(plant.getType(), PlantType.HERB);
    }

    @Test
    void testCreateFungus() {
        Plant plant = PlantFactory.create(PlantType.FUNGUS);
        assertNotNull(plant);
        assertEquals(plant.getType(), PlantType.FUNGUS);
    }
}
