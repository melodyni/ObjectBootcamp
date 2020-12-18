package math.measurement.units;

public enum LengthUnit implements Unit {
    MILLIMETER(1),
    CENTIMETER(10),
    INCH(25),
    FEET(300);
    
    private final double base;
    
    LengthUnit(double base) {
        this.base = base;
    }
    
    @Override
    public double toBase(double value) {
        return value * this.base;
    }
    
    public double toSelf(double value) {
        return value / this.base;
    }
}
