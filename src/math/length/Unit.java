package math.length;

public enum Unit {
    FEET(300),
    CENTIMETER(10),
    INCH(25),
    MILLIMETER(1);

    private final double base;

    Unit(double base) {
        this.base = base;
    }

    public double convertToBase(double value) {
        return value * this.base;
    }

    public double convertTo(double value, Unit unit) {
        double base = this.base / unit.base;
        return value * base;
    }
}
