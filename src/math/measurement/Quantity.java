package math.measurement;

import math.measurement.units.Unit;

import java.util.Objects;

public class Quantity<U extends Unit> {
    private final double magnitude;
    private final U unit;
    
    public Quantity(double magnitude, U unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }
    
    public boolean equivalentTo(Quantity<U> other) {
        return this.toBaseValue() == other.toBaseValue();
    }
    
    protected double toBaseValue() {
        return this.unit.toBase(this.magnitude);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(magnitude, unit);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<?> quantity = (Quantity<?>) o;
        return Double.compare(this.round(quantity.magnitude), this.round(magnitude)) == 0 &&
                       unit.equals(quantity.unit);
    }
    
    private double round(double value) {
        return Math.round((value) * 100) / 100.0;
    }
}
