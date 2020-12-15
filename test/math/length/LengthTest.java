package math.length;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    
    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValue() {
        Length lengthOf2Feet = new Length(2, Unit.FEET);
        assertEquals(lengthOf2Feet,lengthOf2Feet);
    }
    
    @Test
    public void shouldCompareTwoLengthsOfSameUnit() {
        Length lengthOf2Feet = new Length(2, Unit.FEET);
        Length lengthOf3Feet = new Length(3, Unit.FEET);
        assertNotEquals(lengthOf2Feet,lengthOf3Feet);
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInch() {
        Length lengthOf1Feet = new Length(1, Unit.FEET);
        Length lengthOf12Inch = new Length(12, Unit.INCH);
        assertEquals(lengthOf1Feet,lengthOf12Inch);
    }
    

    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeter() {
        Length lengthOf4CM = new Length(4, Unit.CENTIMETER);
        Length lengthOf2Inch = new Length(2, Unit.INCH);
        assertNotEquals(lengthOf2Inch,lengthOf4CM);
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInch() {
        Length lengthOf2Feet = new Length(2, Unit.FEET);
        Length lengthOf12Inch = new Length(12, Unit.INCH);
        assertNotEquals(lengthOf2Feet,lengthOf12Inch);
    }
}