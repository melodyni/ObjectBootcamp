package math.measurement;

import math.measurement.units.TemperatureUnit;
import math.measurement.units.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {
    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValueAsEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET);
        assertTrue(twoFeet.equivalentTo(twoFeet));
    }

    @Test
    public void shouldCompareTwoLengthsOfDifferentValueAndSameUnitAsNotEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET);
        Quantity<LengthUnit> threeFeet = new Quantity<>(3, LengthUnit.FEET);
        assertFalse(twoFeet.equivalentTo(threeFeet));
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInchAsEqual() {
        Quantity<LengthUnit> oneFoot = new Quantity<>(1, LengthUnit.FEET);
        Quantity<LengthUnit> twelveInches = new Quantity<>(12, LengthUnit.INCH);
        assertTrue(oneFoot.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeterAsNotEqual() {
        Quantity<LengthUnit> fourCM = new Quantity<>(4, LengthUnit.CENTIMETER);
        Quantity<LengthUnit> twoInches = new Quantity<>(2, LengthUnit.INCH);
        assertFalse(twoInches.equivalentTo(fourCM));
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInchAsNotEqual() {
        Quantity<LengthUnit> twoFeet = new Quantity<>(2, LengthUnit.FEET);
        Quantity<LengthUnit> twelveInches = new Quantity<>(12, LengthUnit.INCH);
        assertFalse(twoFeet.equivalentTo(twelveInches));
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCMAsEqual() {
        Quantity<LengthUnit> tenMillimeters = new Quantity<>(10, LengthUnit.MILLIMETER);
        Quantity<LengthUnit> oneCentimeter = new Quantity<>(1, LengthUnit.CENTIMETER);
        assertTrue(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCMAsNotEqual() {
        Quantity<LengthUnit> tenMillimeters = new Quantity<>(11, LengthUnit.MILLIMETER);
        Quantity<LengthUnit> oneCentimeter = new Quantity<>(1, LengthUnit.CENTIMETER);
        assertFalse(tenMillimeters.equivalentTo(oneCentimeter));
    }

    @Test
    public void shouldCompareVolumesOfSameUnitAsEqual() {
        final Quantity<VolumeUnit> oneLiter = new Quantity<>(1, VolumeUnit.LITER);
        assertEquals(oneLiter, oneLiter);
    }

    @Test
    public void shouldCompareTwoDifferentTemperatureOfFahrenheitAndCelsiusAsNotEqual() {
        final Quantity<TemperatureUnit> celsius = new Quantity<>(10, TemperatureUnit.CELSIUS
        );
        final Quantity<TemperatureUnit> fahrenheit = new Quantity<>(212, TemperatureUnit.FAHRENHEIT
        );
        assertFalse(celsius.equivalentTo(fahrenheit));
    }

}