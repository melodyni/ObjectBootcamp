package math.measurement;

import math.measurement.units.VolumeUnit;

public class Volume extends Quantity<VolumeUnit> implements Addable<VolumeUnit> {
    final static VolumeUnit standardUnit = VolumeUnit.LITER;
    
    public Volume(double magnitude, VolumeUnit unit) {
        super(magnitude, unit);
    }
    
    @Override
    public Volume add(Quantity<VolumeUnit> quantity) {
        double totalMagnitude = this.toBaseValue() + quantity.toBaseValue();
        return new Volume(standardUnit.toSelf(totalMagnitude), standardUnit);
    }
}
