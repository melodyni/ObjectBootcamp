package math.measurement.units;

public interface Unit {
    double toBase(double value);
    
    double toSelf(double value);
}
