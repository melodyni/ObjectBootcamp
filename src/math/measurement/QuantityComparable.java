package math.measurement;

public interface QuantityComparable<U extends Unit> {
    boolean equivalentTo(Quantity<U> other);
}
