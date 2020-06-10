import com.galvanize.arithmetics.Number;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class NumberTestCase {
    @Test
    void testAddTwoNumbers() {
        // Setup
        Number two = new Number(2);
        Number three = new Number(3);
        Number expected = new Number(5);

        // Exercise
        Number actual = two.plus(three);

        // Assert
        assertEquals(expected, actual);
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testOddNumber() {
        // Setup
        Number three = new Number(3);
        // Assert
        assertTrue(three.isOdd());
        assertThat(three.isOdd()).isTrue();
    }
}
