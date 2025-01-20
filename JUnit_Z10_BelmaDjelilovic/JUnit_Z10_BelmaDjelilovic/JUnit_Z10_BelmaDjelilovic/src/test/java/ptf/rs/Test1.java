package ptf.rs;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplyTest {

    @Test
    public void testPositiveNumbers() throws Exception {
        double result = Multiply.multiply(5.0, 6.0);
        assertEquals(30.0, result, 0.0001);
    }

    @Test
    public void testMultiplicationByZero() throws Exception {
        double result = Multiply.multiply(2.0, 0.0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testNegativeNumbers() throws Exception {
        double result = Multiply.multiply(-3.0, -4.0);
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    public void testMixedNumbers() throws Exception {
        double result = Multiply.multiply(-2.0, 5.0);
        assertEquals(-10.0, result, 0.0001);
    }

    @Test(expected = Exception.class)
    public void testMultiplicationThrowsException() throws Exception {
        Multiply.multiply(10.0, 11.0);
    }
}
