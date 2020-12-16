package math.measurement;

public class Unit {
    static final Unit FEET = new Unit(300,StandardUnit.LENGTH);
    static final Unit CENTIMETER = new Unit(10,StandardUnit.LENGTH);
    static final Unit INCH = new Unit(25,StandardUnit.LENGTH);
    static final Unit MILLIMETER = new Unit(1,StandardUnit.LENGTH);

    static final Unit LITER = new Unit(1,StandardUnit.VOLUME);
    static final Unit GALLON = new Unit(3.78,StandardUnit.VOLUME);

    private final double base;
    private final StandardUnit standardUnit;

    enum StandardUnit{
        LENGTH,VOLUME
    }

    public Unit(double base,StandardUnit standardUnit) {
        this.base = base;
        this.standardUnit = standardUnit;
    }

    public double convertToBase(double value) {
        return value * this.base;
    }

    public double convertTo(double value, Unit unit) {
        double base = this.base / unit.base;
        return value * base;
    }
}
