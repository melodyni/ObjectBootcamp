package math.measurement;

public class Temperature extends Quantity<TemperatureUnit> implements QuantityComparable<TemperatureUnit>{
    public Temperature(double value, TemperatureUnit unit) {
        super(value,unit,TemperatureUnit.FAHRENHEIT);
    }
}
