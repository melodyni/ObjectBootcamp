package math.measurement;

public interface Unit {
    double convertToBase(double value);
    double convertToStandard(double value);
}
