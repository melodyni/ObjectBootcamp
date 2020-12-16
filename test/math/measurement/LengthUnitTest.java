package math.measurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthUnitTest {
    @Test
    public void shouldConvertToBase() {
        double baseValue = LengthUnit.INCH.convertToBase(25);
        assertEquals(625, baseValue, 0.0);
    }

    @Test
    public void shouldConvertGivenValueToGivenUnit() {
        double baseValue = LengthUnit.INCH.convertTo(25, LengthUnit.CENTIMETER);
        assertEquals(62.5, baseValue, 0.0);
    }
}