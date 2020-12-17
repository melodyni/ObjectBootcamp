package math.measurement;

public enum VolumeUnit implements Unit {
    LITER(1), GALLON(3.78);

    private final double base;

    VolumeUnit(double base) {
        this.base = base;
    }

    @Override
    public double toBase(double value) {
        return value * this.base;
    }

    @Override
    public double toSelf(double value) {
        return value / this.base;
    }
}
