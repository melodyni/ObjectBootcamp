package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeTest {

    @Test
    public void shouldAddTwoQuantityOfLiterAndGallonToLiter() {
        final Volume oneLiter = new Volume(1, VolumeUnit.LITER);
        final Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        Volume expected = new Volume(4.78, VolumeUnit.LITER);
        Volume actual = oneLiter.add(oneGallon);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCompareTwoEquivalentVolumesOfGallonAndLiterAsEqual() {
        final Volume oneLiter = new Volume(3.78, VolumeUnit.LITER);
        final Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertTrue(oneGallon.equivalentTo(oneLiter));
    }
}