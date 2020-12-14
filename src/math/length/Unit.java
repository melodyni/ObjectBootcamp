package math.length;

public enum Unit {
    FEET(12),
    CENTIMETER(0.4),
    INCH(1);
    
    private final double base;
    
    Unit(double base) {
        this.base = base;
    }
    
    public double convertToBase(int value) {
        return value * this.base;
    }
}
