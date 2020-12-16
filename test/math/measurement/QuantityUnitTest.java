package math.measurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityUnitTest {
    @Test
    public void shouldConvertToBase() {
        double baseValue = Unit.INCH.convertToBase(25);
        assertEquals(625, baseValue, 0.0);
    }

    @Test
    public void shouldConvertGivenValueToGivenUnit() {
        double baseValue = Unit.INCH.convertTo(25, Unit.CENTIMETER);
        assertEquals(62.5, baseValue, 0.0);
    }
}