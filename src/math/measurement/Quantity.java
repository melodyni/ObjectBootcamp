package math.measurement;

import java.util.Objects;

public class Quantity<U extends Unit> {
    private final double value;
    private final U unit;

    public Quantity(double value, U unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equivalentTo(Quantity<U> other) {
        return this.toBaseValue() == other.toBaseValue();
    }

    private double toBaseValue() {
        return this.unit.toBase(this.value);
    }

    public Quantity<U> add(Quantity<U> quantity, U standardUnit) {
        final double thisInBase = this.toBaseValue();
        final double otherInBase = quantity.toBaseValue();
        double sum = this.round(thisInBase, otherInBase);
        return new Quantity<>(standardUnit.toSelf(sum), standardUnit);
    }

    private double round(double thisInBase, double otherInBase) {
        return Math.round((thisInBase + otherInBase) * 100) / 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<?> quantity = (Quantity<?>) o;
        return Double.compare(quantity.value, value) == 0 &&
            unit.equals(quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
