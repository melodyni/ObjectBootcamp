package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitsTest {
    @Test
    public void shouldConvertTheValueIntoItsBaseUnit() {
        Units length = new Units(LengthUnit.INCH);
        length.convert(2, LengthUnit.MILLIMETER);

    }
}