package math.measurement;

public class Length extends QuantityAddable<LengthUnit> {
    public Length(double magnitude, LengthUnit unit) {
        super(magnitude, unit);
    }
    
    
    @Override
    protected LengthUnit getStandardUnit() {
        return LengthUnit.INCH;
    }
    
    @Override
    protected Length createAddableQuantity(double magnitude, LengthUnit unit) {
        return new Length(magnitude, unit);
    }
}
