package math.measurement;

import math.measurement.units.VolumeUnit;

public class Volume extends Quantity<VolumeUnit> implements QuantityAddable<VolumeUnit> {
    public Volume(double magnitude, VolumeUnit unit) {
        super(magnitude, unit);
    }
    
    @Override
    public Volume add(Quantity<VolumeUnit> quantity) {
        final double thisInBase = this.toBaseValue();
        final double otherInBase = quantity.toBaseValue();
        double totalMagnitude = thisInBase + otherInBase;
        return new Volume(VolumeUnit.LITER.toSelf(totalMagnitude), VolumeUnit.LITER);
    }
}
