package math.measurement;

import math.measurement.units.LengthUnit;

public class Length extends Quantity<LengthUnit> implements Addable<LengthUnit> {
    public Length(double magnitude, LengthUnit unit) {
        super(magnitude, unit);
    }
    
    @Override
    public Length add(Quantity<LengthUnit> quantity) {
        final double thisInBase = this.toBaseValue();
        final double otherInBase = quantity.toBaseValue();
        double totalMagnitude = thisInBase + otherInBase;
        return new Length(LengthUnit.INCH.toSelf(totalMagnitude), LengthUnit.INCH);
    }
}
