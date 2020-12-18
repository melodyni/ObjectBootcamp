package math.measurement;

public abstract class QuantityAddable<U extends Unit> extends Quantity<U> {
    public QuantityAddable(double magnitude, U unit) {
        super(magnitude, unit);
    }
    
    QuantityAddable<U> add(Quantity<U> quantity) {
        final U standardUnit = this.getStandardUnit();
        double totalMagnitude = this.toBaseValue() + quantity.toBaseValue();
        return this.createAddableQuantity(standardUnit.toSelf(totalMagnitude), standardUnit);
    }
    
    protected abstract U getStandardUnit();
    
    protected abstract QuantityAddable<U> createAddableQuantity(double magnitude, U unit);
}
