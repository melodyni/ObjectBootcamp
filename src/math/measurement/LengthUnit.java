package math.measurement;

public enum LengthUnit {
    FEET(300),
    CENTIMETER(10),
    INCH(25),
    MILLIMETER(1);

    private final double base;

    LengthUnit(double base) {
        this.base = base;
    }

    public double convertToBase(double value) {
        return value * this.base;
    }

    public double convertTo(double value, LengthUnit lengthUnit) {
        double base = this.base / lengthUnit.base;
        return value * base;
    }
}
