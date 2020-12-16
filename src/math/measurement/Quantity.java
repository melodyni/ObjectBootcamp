package math.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;
    
    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Quantity)) return false;
        Quantity otherQuantity = (Quantity) other;
        final double thisInBase = this.unit.convertToBase(this.value);
        final double otherInBase = otherQuantity.unit.convertToBase(otherQuantity.value);
        return thisInBase == otherInBase;
    }

    public Quantity add(Quantity quantity) {
        final double thisInBase = this.unit.convertTo(this.value, this.unit);
        final double otherInBase = quantity.unit.convertTo(quantity.value, this.unit);
        double sum = thisInBase + otherInBase;
        return new Quantity(sum, this.unit);
    }
}
