package math.probability;

public class Chance {

    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public double complement() {
        return 1 - this.probability;
    }
}
