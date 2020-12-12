package math.probability;

public class Chance {
    private final int noOfCoins;

    public Chance(int noOfCoins) {
        this.noOfCoins = noOfCoins;
    }

    public double calcFavorableChance(int noOfFavorableEvent) {
        return  (double) noOfFavorableEvent / (this.noOfCoins * 2);
    }

    public double calcNonFavorableChance(int noOfFavorableEvent) {
        return 1 - this.calcFavorableChance(noOfFavorableEvent);
    }
}
