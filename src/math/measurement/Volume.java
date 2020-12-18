package math.measurement;

public class Volume extends QuantityAddable<VolumeUnit> {
    public Volume(double magnitude, VolumeUnit unit) {
        super(magnitude, unit);
    }
    
    
    @Override
    protected VolumeUnit getStandardUnit() {
        return VolumeUnit.LITER;
    }
    
    @Override
    protected Volume createAddableQuantity(double magnitude, VolumeUnit unit) {
        return new Volume(magnitude, unit);
    }
    
}
