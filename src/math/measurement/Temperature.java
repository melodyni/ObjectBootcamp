package math.measurement;

import math.measurement.units.TemperatureUnit;

public class Temperature extends Quantity<TemperatureUnit> {
    public Temperature(double value, TemperatureUnit unit) {
        super(value, unit);
    }
}
