package math.measurement;

import math.measurement.units.Unit;

public interface Addable<U extends Unit> {
    Addable<U> add(Quantity<U> quantity);
}
