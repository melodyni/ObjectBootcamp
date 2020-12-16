package math.measurement;

public class Volume {
    
    private final double value;
    private final VolumeUnit volumeUnit;
    
    public Volume(double value, VolumeUnit volumeUnit) {
        this.value = value;
        
        this.volumeUnit = volumeUnit;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Volume)) return false;
        Volume otherVolume = (Volume) other;
        final double thisInBase = this.volumeUnit.convertToBase(this.value);
        final double otherInBase =
                otherVolume.volumeUnit.convertToBase(otherVolume.value);
        return thisInBase == otherInBase;
    }
    
    public Volume add(Volume volume) {
        final double thisInBase = this.volumeUnit.convertTo(this.value, this.volumeUnit);
        final double otherInBase = volume.volumeUnit.convertTo(volume.value,
                this.volumeUnit);
        double sum = thisInBase + otherInBase;
        return new Volume(sum, this.volumeUnit);
    }
}
