import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(0.4, Math.round(calculator.add(12.4, -12) * 100.00) / 100.00);
    }

    @Test
    void remove() {
        assertEquals(77, calculator.subtract(88, 11));
    }

    @Test
    void multiply() {
        assertEquals(18, calculator.multiply(12, 1.5));
    }

    @Test
    void divide() {
        assertEquals(6, calculator.divide(36, 6));
    }
}