package math.length;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuantityTest {

    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValue() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        assertEquals(twoFeet, twoFeet);
    }

    @Test
    public void shouldCompareTwoLengthsOfSameUnit() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        Quantity threeFeet = new Quantity(3, Unit.FEET);
        assertNotEquals(twoFeet, threeFeet);
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInch() {
        Quantity oneFeet = new Quantity(1, Unit.FEET);
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        assertEquals(oneFeet, twelveInch);
    }


    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeter() {
        Quantity fourCM = new Quantity(4, Unit.CENTIMETER);
        Quantity twoInch = new Quantity(2, Unit.INCH);
        assertNotEquals(twoInch, fourCM);
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInch() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        assertNotEquals(twoFeet, twelveInch);
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCM() {
        Quantity tenMillimeter = new Quantity(10, Unit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, Unit.CENTIMETER);
        assertEquals(tenMillimeter, oneCentimeter);
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCM() {
        Quantity tenMillimeter = new Quantity(11, Unit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, Unit.CENTIMETER);
        assertNotEquals(tenMillimeter, oneCentimeter);
    }

    @Test
    public void shouldAddTwoLengthInInches() {
        Quantity twoInch = new Quantity(2, Unit.INCH);
        Quantity expected = new Quantity(4, Unit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }
}