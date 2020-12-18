package math.measurement;

public interface QuantityAddable<U extends Unit> {
    QuantityAddable<U> add(Quantity<U> quantity);
}
