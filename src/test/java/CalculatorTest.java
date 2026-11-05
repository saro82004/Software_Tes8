
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void testAverage() {

        double result = cal.average(10, 20, 30);

        assertEquals(20.0, result, 0.001);
    }

    @Test
    public void testAverageWithZero() {

        double result = cal.average(0, 0, 0);

        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testAverageWithNegativeNumbers() {

        double result = cal.average(-10, -20, -30);

        assertEquals(-20.0, result, 0.001);
    }

    @Test
    public void testAverageWithDecimalResult() {

        double result = cal.average(10, 20, 25);

        assertEquals(18.333, result, 0.001);
    }
}
