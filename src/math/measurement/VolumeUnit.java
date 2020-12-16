package math.measurement;

public enum VolumeUnit implements Unit {
    LITER(1), GALLON(3.78);

    private final double base;
    private static final VolumeUnit standardUnit = LITER;

    VolumeUnit(double base) {
        this.base = base;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.base;
    }

    @Override
    public double convertTo(double value, Unit unit) {
        VolumeUnit volumeUnit = (VolumeUnit) unit;
        return value * this.base / volumeUnit.base;
    }
}
