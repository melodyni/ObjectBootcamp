package math.measurement;

public interface Unit {
    double convertToBase(double value);

    double toSelf(double value);
}
