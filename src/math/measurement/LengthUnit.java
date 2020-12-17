package math.measurement;

public enum LengthUnit implements Unit {
    MILLIMETER(1),
    CENTIMETER(10),
    INCH(25),
    FEET(300);

    LengthUnit(double base) {
        this.base = base;
    }

    private final double base;

    @Override
    public double toBase(double value) {
        return value * this.base;
    }

    public double toSelf(double value) {
        return value / this.base;
    }
}
