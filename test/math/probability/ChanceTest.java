package math.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void shouldRepresentChanceOfNotGettingTailsOnFlippingACoin() {
        Chance chanceOfGettingTails = new Chance(0.5);
        assertEquals(new Chance(0.5) , chanceOfGettingTails.not());
    }

    @Test
    public void shouldRepresentChanceOfGettingTwoTailsOnFlippingTwoCoins() {
        Chance chanceOfGettingTails = new Chance(0.5);
        Chance expected = new Chance(0.25);
        assertEquals(expected, chanceOfGettingTails.and(chanceOfGettingTails));
    }


    @Test
    public void shouldRepresentChanceOfGettingEitherHeadOrTailOnFlippingTwoCoins() {
        Chance chanceOfGettingTails = new Chance(0.5);
        Chance expected = new Chance(0.75);
        assertEquals(expected, chanceOfGettingTails.or(chanceOfGettingTails));
    }
}