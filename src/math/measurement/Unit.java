package math.measurement;

public interface Unit {
    double toBase(double value);
    double toSelf(double value);
}
