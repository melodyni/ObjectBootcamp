package math.measurement;

public class Length extends Quantity<LengthUnit> implements QuantityComparable<LengthUnit> ,QuantityAddable<LengthUnit> {
    public Length(double value, LengthUnit unit) {
        super(value, unit, LengthUnit.INCH);
    }
}
