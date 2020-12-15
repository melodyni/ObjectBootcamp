package math.length;

public class Length {
    private final int value;
    private final Unit unit;
    
    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Length)) return false;
        Length otherLength = (Length) other;
        final double thisInInch = this.unit.convertToBase(this.value);
        final double otherInInch = otherLength.unit.convertToBase(otherLength.value);
        return thisInInch == otherInInch;
    }
}
