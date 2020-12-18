package math.measurement;

public interface QuantityAddable<U extends Unit> {
    Quantity<U> add(Quantity<U> quantity);
}
