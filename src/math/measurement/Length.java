package math.measurement;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;
    
    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Length)) return false;
        Length otherLength = (Length) other;
        final double thisInBase = this.lengthUnit.convertToBase(this.value);
        final double otherInBase = otherLength.lengthUnit.convertToBase(otherLength.value);
        return thisInBase == otherInBase;
    }

    public Length add(Length length) {
        final double thisInBase = this.lengthUnit.convertTo(this.value, this.lengthUnit);
        final double otherInBase = length.lengthUnit.convertTo(length.value, this.lengthUnit);
        double sum = thisInBase + otherInBase;
        return new Length(sum, this.lengthUnit);
    }
}
