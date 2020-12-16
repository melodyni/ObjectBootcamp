package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValueAsEqual() {
        Quantity twoFeet = new Quantity(2, LengthUnit.FEET);
        assertTrue(twoFeet.equivalentTo(twoFeet));
    }

    @Test
    public void shouldCompareTwoLengthsOfDifferentValueAndSameUnitAsNotEqual() {
        Quantity twoFeet = new Quantity(2, LengthUnit.FEET);
        Quantity threeFeet = new Quantity(3, LengthUnit.FEET);
        assertFalse(twoFeet.equivalentTo(threeFeet));
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInchAsEqual() {
        Quantity oneFoot = new Quantity(1, LengthUnit.FEET);
        Quantity twelveInches = new Quantity(12, LengthUnit.INCH);
        assertTrue(oneFoot.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeterAsNotEqual() {
        Quantity fourCM = new Quantity(4, LengthUnit.CENTIMETER);
        Quantity twoInches = new Quantity(2, LengthUnit.INCH);
        assertFalse(twoInches.equivalentTo(fourCM));
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInchAsNotEqual() {
        Quantity twoFeet = new Quantity(2, LengthUnit.FEET);
        Quantity twelveInches = new Quantity(12, LengthUnit.INCH);
        assertFalse(twoFeet.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCMAsEqual() {
        Quantity tenMillimeters = new Quantity(10, LengthUnit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, LengthUnit.CENTIMETER);
        assertTrue(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCMAsNotEqual() {
        Quantity tenMillimeters = new Quantity(11, LengthUnit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, LengthUnit.CENTIMETER);
        assertFalse(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldAddTwoLengthsOfUnitInch() {
        Quantity twoInch = new Quantity(2, LengthUnit.INCH);
        Quantity expected = new Quantity(4, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }


    @Test
    public void shouldAddTwoLengthsOfInchAndCentimeter() {
        Quantity twoInch = new Quantity(2, LengthUnit.INCH);
        Quantity twoPointFiveCM = new Quantity(2.5, LengthUnit.CENTIMETER);
        Quantity expected = new Quantity(3, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoPointFiveCM));
    }

}