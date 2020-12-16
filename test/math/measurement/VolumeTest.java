package math.measurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void shouldCompareVolumeOfSameUnitToEquals() {
        final Volume oneLiter = new Volume(1, VolumeUnit.LITER);
        assertEquals(oneLiter, oneLiter);
    }
    
    @Test
    public void shouldCompareTwoEqualVolumesOfGallonAndLiter() {
        final Volume oneLitter = new Volume(3.78, VolumeUnit.LITER);
        final Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertEquals(oneGallon, oneLitter);
    }
    
    @Test
    public void shouldAddTwoVolumesOfLiterAndGallonToLiter() {
        final Volume oneLiter = new Volume(1, VolumeUnit.LITER);
        final Volume oneGallon = new Volume(1, VolumeUnit.GALLON);
        assertEquals(new Volume(4.78, VolumeUnit.LITER),oneGallon.add(oneLiter));
    }
}