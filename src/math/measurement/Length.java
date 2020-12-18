package math.measurement;

import math.measurement.units.LengthUnit;

public class Length extends Quantity<LengthUnit> implements Addable<LengthUnit> {
    private final static LengthUnit standardUnit = LengthUnit.INCH;
    public Length(double magnitude, LengthUnit unit) {
        super(magnitude, unit);
    }
    
    @Override
    public Length add(Quantity<LengthUnit> quantity) {
        double totalMagnitude = this.toBaseValue() + quantity.toBaseValue();
        return new Length(standardUnit.toSelf(totalMagnitude), standardUnit);
    }
}
