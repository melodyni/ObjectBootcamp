package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValueAsEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET, LengthUnit.INCH);
        assertTrue(twoFeet.equivalentTo(twoFeet));
    }

    @Test
    public void shouldCompareTwoLengthsOfDifferentValueAndSameUnitAsNotEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET, LengthUnit.INCH);
        Quantity<LengthUnit> threeFeet = new Quantity<>(3, LengthUnit.FEET, LengthUnit.INCH);
        assertFalse(twoFeet.equivalentTo(threeFeet));
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInchAsEqual() {
        Quantity<LengthUnit> oneFoot = new Quantity<>(1, LengthUnit.FEET, LengthUnit.INCH);
        Quantity<LengthUnit> twelveInches = new Quantity<>(12, LengthUnit.INCH, LengthUnit.INCH);
        assertTrue(oneFoot.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeterAsNotEqual() {
        Quantity<LengthUnit> fourCM = new Quantity<>(4, LengthUnit.CENTIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> twoInches = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(twoInches.equivalentTo(fourCM));
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInchAsNotEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET, LengthUnit.INCH);
        Quantity<LengthUnit> twelveInches = new Quantity<>(12, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(twoFeet.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCMAsEqual() {
        Quantity<LengthUnit> tenMillimeters = new Quantity<>(10, LengthUnit.MILLIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> oneCentimeter = new Quantity<>(1, LengthUnit.CENTIMETER, LengthUnit.INCH);
        assertTrue(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCMAsNotEqual() {
        Quantity<LengthUnit> tenMillimeters = new Quantity<>(11, LengthUnit.MILLIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> oneCentimeter = new Quantity<>(1, LengthUnit.CENTIMETER, LengthUnit.INCH);
        assertFalse(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldAddTwoLengthsOfUnitInch() {
        Quantity<LengthUnit> twoInch = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(4, LengthUnit.INCH, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }


    @Test
    public void shouldAddTwoLengthsOfInchAndCentimeter() {
        Quantity<LengthUnit> twoInch = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Quantity<LengthUnit> twoPointFiveCM = new Quantity<>(2.5, LengthUnit.CENTIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(3, LengthUnit.INCH, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoPointFiveCM));
    }

    @Test
    public void shouldAddTwoLengthsOfMillimeterAndCentimeter() {
        Quantity<LengthUnit> twentyFiveMillimeter = new Quantity<>(25, LengthUnit.MILLIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> twoPointFiveCM = new Quantity<>(2.5, LengthUnit.CENTIMETER, LengthUnit.INCH);
        Quantity<LengthUnit> expected = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertEquals(expected, twentyFiveMillimeter.add(twoPointFiveCM));
    }

    @Test
    public void shouldCompareVolumesOfSameUnitAsEqual() {
        final Quantity<VolumeUnit> oneLiter = new Quantity<>(1, VolumeUnit.LITER, VolumeUnit.LITER);
        assertEquals(oneLiter, oneLiter);
    }

    @Test
    public void shouldCompareTwoEquivalentVolumesOfGallonAndLiterAsEqual() {
        final Quantity<VolumeUnit> oneLiter = new Quantity<>(3.78, VolumeUnit.LITER, VolumeUnit.LITER);
        final Quantity<VolumeUnit> oneGallon = new Quantity<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        assertTrue(oneGallon.equivalentTo(oneLiter));
    }

    @Test
    public void shouldAddTwoQuantityOfLiterAndGallonToLiter() {
        final Quantity<VolumeUnit> oneLiter = new Quantity<>(1, VolumeUnit.LITER, VolumeUnit.LITER);
        final Quantity<VolumeUnit> oneGallon = new Quantity<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        Quantity<VolumeUnit> expected = new Quantity<>(4.78, VolumeUnit.LITER, VolumeUnit.LITER);
        Quantity<VolumeUnit> actual = oneLiter.add(oneGallon);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareTwoEquivalentTemperatureOfFahrenheitAndCelsiusAsEqual() {
        final Quantity<TemperatureUnit> celsius = new Quantity<>(100, TemperatureUnit.CELSIUS,
            TemperatureUnit.CELSIUS);
        final Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT,
            TemperatureUnit.CELSIUS);
        assertTrue(celsius.equivalentTo(fahrenheit));
    }

    @Test
    public void shouldCompareTwoDifferentTemperatureOfFahrenheitAndCelsiusAsNotEqual() {
        final Quantity<TemperatureUnit> celsius = new Quantity<>(10, TemperatureUnit.CELSIUS,
            TemperatureUnit.CELSIUS);
        final Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT,
            TemperatureUnit.CELSIUS);
        assertFalse(celsius.equivalentTo(fahrenheit));
    }
}