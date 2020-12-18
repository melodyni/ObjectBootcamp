package math.measurement;

import java.util.Objects;

public class Quantity<U extends Unit> {
    private final double value;
    private final U unit;
    private final U standardUnit;

    public Quantity(double value, U unit, U standardUnit) {
        this.value = value;
        this.unit = unit;
        this.standardUnit = standardUnit;
    }

    public boolean equivalentTo(Quantity<U> other) {
        return this.toBaseValue() == other.toBaseValue();
    }

    private double toBaseValue() {
        return this.unit.toBase(this.value);
    }

    public Quantity<U> add(Quantity<U> quantity) {
        final double thisInBase = this.toBaseValue();
        final double otherInBase = quantity.toBaseValue();
        double sum = this.round(thisInBase + otherInBase);
        return new Quantity<>(this.standardUnit.toSelf(sum), this.standardUnit, this.standardUnit);
    }

    private double round(double value ) {
        return Math.round((value) * 100) / 100.0;
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
