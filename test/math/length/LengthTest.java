package math.length;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareTwoLengthsOfSameUnit() {
        Length lengthOf2Feet = new Length(2, Units.FEET);
        Length lengthOf3Feet = new Length(3, Units.FEET);
        assertEquals(-1, lengthOf2Feet.compare(lengthOf3Feet));
    }

    @Test
    public void shouldCompareTwoLengthsOfDifferentUnit() {
        Length lengthOf1Feet = new Length(1, Units.FEET);
        Length lengthOf12Inch = new Length(12, Units.INCH);
        assertEquals(0, lengthOf1Feet.compare(lengthOf12Inch));
    }
}