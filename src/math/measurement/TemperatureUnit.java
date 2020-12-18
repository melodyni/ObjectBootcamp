package math.measurement;

public enum TemperatureUnit implements Unit {
    FAHRENHEIT(1), CELSIUS(1.8);
    TemperatureUnit(double base) {
        this.base = base;
    }

    private final double base;

    @Override
    public double toBase(double value) {
        double constant = 0;
        if(this.base != 1){
            constant = 32;
        }
        return  (value *this.base) + constant;
    }

    public double toSelf(double value) {
        return value / this.base;
    }

}
