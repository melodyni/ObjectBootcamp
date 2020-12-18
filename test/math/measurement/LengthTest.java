package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
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