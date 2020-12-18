package math.measurement;

import math.measurement.units.Unit;

public interface QuantityAddable<U extends Unit> {
    QuantityAddable<U> add(Quantity<U> quantity);
}
