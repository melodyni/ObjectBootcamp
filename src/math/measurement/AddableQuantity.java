package math.measurement;

import math.measurement.units.Unit;

public abstract class AddableQuantity<U extends Unit> extends Quantity<U> {
    public AddableQuantity(double magnitude, U unit) {
        super(magnitude, unit);
    }
    
    AddableQuantity<U> add(Quantity<U> quantity) {
        final U standardUnit = this.getStandardUnit();
        double totalMagnitude = this.toBaseValue() + quantity.toBaseValue();
        return this.createAddableQuantity(standardUnit.toSelf(totalMagnitude), standardUnit);
    }
    
    protected abstract U getStandardUnit();
    
    protected abstract AddableQuantity<U> createAddableQuantity(double magnitude, U unit);
}
