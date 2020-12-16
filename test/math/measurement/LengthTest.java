package math.measurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {

    @Test
    public void shouldCompareTwoLengthsOfSameUnitAndSameValue() {
        Length twoFeet = new Length(2, LengthUnit.FEET);
        assertEquals(twoFeet, twoFeet);
    }

    @Test
    public void shouldCompareTwoLengthsOfSameUnit() {
        Length twoFeet = new Length(2, LengthUnit.FEET);
        Length threeFeet = new Length(3, LengthUnit.FEET);
        assertNotEquals(twoFeet, threeFeet);
    }

    @Test
    public void shouldCompareTwoEqualLengthsOfUnitFeetAndInch() {
        Length oneFeet = new Length(1, LengthUnit.FEET);
        Length twelveInch = new Length(12, LengthUnit.INCH);
        assertEquals(oneFeet, twelveInch);
    }


    @Test
    public void shouldCompareTwoUnequalLengthOfUnitInchAndCentimeter() {
        Length fourCM = new Length(4, LengthUnit.CENTIMETER);
        Length twoInch = new Length(2, LengthUnit.INCH);
        assertNotEquals(twoInch, fourCM);
    }

    @Test
    public void shouldCompareTwoUnequalLengthsOfUnitFeetAndInch() {
        Length twoFeet = new Length(2, LengthUnit.FEET);
        Length twelveInch = new Length(12, LengthUnit.INCH);
        assertNotEquals(twoFeet, twelveInch);
    }

    @Test
    public void shouldCompareTwoEqualLengthOfMillimeterAndCM() {
        Length tenMillimeter = new Length(10, LengthUnit.MILLIMETER);
        Length oneCentimeter = new Length(1, LengthUnit.CENTIMETER);
        assertEquals(tenMillimeter, oneCentimeter);
    }

    @Test
    public void shouldCompareTwoUnequalLengthOfMillimeterAndCM() {
        Length tenMillimeter = new Length(11, LengthUnit.MILLIMETER);
        Length oneCentimeter = new Length(1, LengthUnit.CENTIMETER);
        assertNotEquals(tenMillimeter, oneCentimeter);
    }

    @Test
    public void shouldAddTwoLengthInInches() {
        Length twoInch = new Length(2, LengthUnit.INCH);
        Length expected = new Length(4, LengthUnit.INCH);
        assertEquals(expected, twoInch.add(twoInch));
    }
}