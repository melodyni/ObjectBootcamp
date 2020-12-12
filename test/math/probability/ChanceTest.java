package math.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void shouldTellTheChanceOfGettingTailsOnFlippingOneCoin() {
        Chance chance = new Chance(1);
        assertEquals(0.5,chance.calcFavorableChance(1),0);
    }

    @Test
    public void shouldTellTheChanceOfNotGettingTailsOnFlippingOneCoin() {
        Chance chance = new Chance(1);
        assertEquals(0.5,chance.calcNonFavorableChance(1),0);
    }

    @Test
    public void shouldTellTheChanceOfGettingTwoTailsOnFlippingTwoCoins() {
        Chance chance = new Chance(2);
        assertEquals(0.25,chance.calcFavorableChance(1),0);
    }
}