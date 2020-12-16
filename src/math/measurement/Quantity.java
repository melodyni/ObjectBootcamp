package math.measurement;

import java.util.Objects;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equivalentTo(Quantity other) {
        return this.toBaseValue() == other.toBaseValue();
    }

    private double toBaseValue() {
        return this.unit.convertToBase(this.value);
    }

    public Quantity add(Quantity quantity) {
        final double thisInBase = this.unit.convertTo(this.value, this.unit);
        final double otherInBase = quantity.unit.convertTo(quantity.value, this.unit);
        double sum = this.round(thisInBase, otherInBase);
        return new Quantity(sum, this.unit);
    }

    private double round(double thisInBase, double otherInBase) {
        return Math.round((thisInBase + otherInBase) * 100) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
            unit.equals(quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
