package ptf.rs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void factorial_Throws_ForNegative() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.factorial(-1));
    }

    @Test
    void factorial_ReturnsOne_ForZero() {
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    void factorial_ReturnsOne_ForOne() {
        assertEquals(1, Calculator.factorial(1));
    }

    @Test
    @Timeout(1)
    void factorial_LargerNumber() {
        assertEquals(6402373705728000L, Calculator.factorial(18));
    }


}