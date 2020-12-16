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
    private static final LengthUnit standardUnit = INCH;

    @Override
    public double convertToBase(double value) {
        return value * this.base;
    }

    @Override
    public double convertTo(double value, Unit unit) {
        LengthUnit lengthUnit = (LengthUnit) unit;
        return value * this.base / lengthUnit.base;
    }

}
