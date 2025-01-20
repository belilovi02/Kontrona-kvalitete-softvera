package ptf.rs;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ConvertorTest {

    private final double EPSILON = 0.0001;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void inchToCm_OneInchValid() {
        assertEquals((double)2.54, Convertor.inchToCm(1), EPSILON);
    }

    @Test
    void inchToCm_ThreeInchValid() {
        assertEquals((double)7.62, Convertor.inchToCm(3), EPSILON);
    }

    @Test
    void inchToCm_NegativeInchesValid() {
        assertThrows(IllegalArgumentException.class, () -> {
            Convertor.inchToCm(-3);
        });
    }

    @Test
    void fahrenheitToCelsius_ZeroValue() {
        assertEquals((double)-17.7777, Convertor.fahrenheitToCelsius(0), EPSILON);
    }

    @Test
    void fahrenheitToCelsius_ValidPositive() {
        assertEquals(30.00, Convertor.fahrenheitToCelsius(86), EPSILON);
    }

    @Test
    void fahrenheitToCelsius_ValidNegative() {
        assertEquals((double)-65.5556, Convertor.fahrenheitToCelsius(-86), EPSILON);
    }

}