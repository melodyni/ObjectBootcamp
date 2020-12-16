package math.measurement;

public enum VolumeUnit {
    LITER(1), GALLON(3.78);
    
    private final double base;
    
    VolumeUnit(double base) {
        this.base = base;
    }
    
    public double convertToBase(double value) {
        return value * this.base;
    }
    
    public double convertTo(double value, VolumeUnit volumeUnit) {
        double base = this.base / volumeUnit.base;
        return value * base;
    }
}
