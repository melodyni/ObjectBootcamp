package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    
    @Test
    public void shouldAddTwoLengthsOfInchAndCentimeter() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length twoPointFiveCM = new Length(2.5, LengthUnit.CENTIMETER);
        Length expected = new Length(3, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoPointFiveCM));
    }

    @Test
    public void shouldAddTwoLengthsOfMillimeterAndCentimeter() {
        Length twentyFiveMillimeter = new Length(25, LengthUnit.MILLIMETER);
        Length twoPointFiveCM = new Length(2.5, LengthUnit.CENTIMETER);
        Length expected = new Length(2, LengthUnit.INCH);
        assertEquals(expected, twentyFiveMillimeter.add(twoPointFiveCM));
    }

    @Test
    public void shouldAddTwoLengthsOfUnitInch() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length expected = new Length(4, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }

    @Test
    public void shouldCompareTwoEquivalentLengthOfInchAndFeetAsEqual() {
        final Length twelveInch = new Length(12, LengthUnit.INCH);
        final Length oneFeet = new Length(1, LengthUnit.FEET);
        assertTrue(twelveInch.equivalentTo(oneFeet));
    }
    
    @Test
    public void shouldCompareTwoDifferentLengthOfInchAndFeetAsNotEqual() {
        final Length tenInch = new Length(10, LengthUnit.INCH);
        final Length oneFeet = new Length(1, LengthUnit.FEET);
        assertFalse(tenInch.equivalentTo(oneFeet));
    }
    
}