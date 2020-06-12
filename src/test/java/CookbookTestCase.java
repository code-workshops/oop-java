import com.galvanize.cookbook.Cookbook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookbookTestCase {
    private Cookbook cookbook;

    @BeforeEach
    void setUp() {
        cookbook = new Cookbook();
    }

    @Test
    void testSmoke() {
        assertNotNull(cookbook);
    }

    @Test
    void testAddNewRecipe() {
        String recipePath = "data/bread.txt";
        cookbook.createRecipe(recipePath);

        assertEquals(1, cookbook.recipeCount());
    }
}
