package math.measurement.units;

public enum TemperatureUnit implements Unit {
    FAHRENHEIT(1, 0), CELSIUS(1.8, 32);
    
    private final double base;
    private final int constant;
    TemperatureUnit(double base, int constant) {
        this.base = base;
        this.constant = constant;
    }
    
    @Override
    public double toBase(double value) {
        return (value * this.base) + this.constant;
    }
    
    public double toSelf(double value) {
        return value / this.base;
    }
    
}
