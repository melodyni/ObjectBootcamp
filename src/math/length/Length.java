package math.length;

public class Length {
    private int value;
    private Unit unit;
    
    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }
    
    public int compare(Length other) {
        final double thisInInch = this.unit.convertToBase(this.value);
        final double otherInInch = other.unit.convertToBase(other.value);
        if (thisInInch > otherInInch) {
            return 1;
        } else if (thisInInch < otherInInch) {
            return -1;
        }
        return 0;
    }
}
