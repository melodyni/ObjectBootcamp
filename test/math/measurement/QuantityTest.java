package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValueAsEqual() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        assertTrue(twoFeet.equivalentTo(twoFeet));
    }

    @Test
    public void shouldCompareTwoLengthsOfDifferentValueAndSameUnitAsNotEqual() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        Quantity threeFeet = new Quantity(3, Unit.FEET);
        assertFalse(twoFeet.equivalentTo(threeFeet));
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInchAsEqual() {
        Quantity oneFoot = new Quantity(1, Unit.FEET);
        Quantity twelveInches = new Quantity(12, Unit.INCH);
        assertTrue(oneFoot.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeterAsNotEqual() {
        Quantity fourCM = new Quantity(4, Unit.CENTIMETER);
        Quantity twoInches = new Quantity(2, Unit.INCH);
        assertFalse(twoInches.equivalentTo(fourCM));
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInchAsNotEqual() {
        Quantity twoFeet = new Quantity(2, Unit.FEET);
        Quantity twelveInches = new Quantity(12, Unit.INCH);
        assertFalse(twoFeet.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCMAsEqual() {
        Quantity tenMillimeters = new Quantity(10, Unit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, Unit.CENTIMETER);
        assertTrue(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCMAsNotEqual() {
        Quantity tenMillimeters = new Quantity(11, Unit.MILLIMETER);
        Quantity oneCentimeter = new Quantity(1, Unit.CENTIMETER);
        assertFalse(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldAddTwoLengthsOfUnitInch() {
        Quantity twoInch = new Quantity(2, Unit.INCH);
        Quantity expected = new Quantity(4, Unit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }


    @Test
    public void shouldAddTwoLengthsOfInchAndCentimeter() {
        Quantity twoInch = new Quantity(2, Unit.INCH);
        Quantity twoPointFiveCM = new Quantity(2.5, Unit.CENTIMETER);
        Quantity expected = new Quantity(3, Unit.INCH);
        assertEquals(expected, twoInch.add(twoPointFiveCM));
    }

    @Test
    public void shouldCompareVolumesOfSameUnitAsEqual() {
        final Quantity oneLiter = new Quantity(1, Unit.LITER);
        assertEquals(oneLiter, oneLiter);
    }

    @Test
    public void shouldCompareTwoEquivalentVolumesOfGallonAndLiterAsEqual() {
        final Quantity oneLiter = new Quantity(3.78, Unit.LITER);
        final Quantity oneGallon = new Quantity(1, Unit.GALLON);
        assertTrue(oneGallon.equivalentTo(oneLiter));
    }

    @Test
    public void shouldAddTwoQuantityOfLiterAndGallonToLiter() {
        final Quantity oneLiter = new Quantity(1, Unit.LITER);
        final Quantity oneGallon = new Quantity(1, Unit.GALLON);
        Quantity expected = new Quantity(4.78, Unit.LITER);
        Quantity actual = oneLiter.add(oneGallon);
        assertEquals(expected, actual);
    }
}