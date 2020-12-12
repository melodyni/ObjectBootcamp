package math.probability;

public class Chance {

    private final double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance not() {
        return new Chance(1 - this.probability);
    }

    public Chance and(Chance otherChance) {
        return new Chance(this.probability * otherChance.probability);
    }

    public Chance or(Chance otherChance) {
        Chance complementOfChance = this.not();
        Chance complementOfOtherChance = otherChance.not();
        return complementOfChance.and(complementOfOtherChance).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.probability, probability) == 0;
    }
}
