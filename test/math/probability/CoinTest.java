package math.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {
    @Test
    public void shouldTellChanceOfGettingTails() {
        assertEquals( 0.5, Coin.ChanceOfGettingTails,0);
    }

    @Test
    public void shouldTellChanceOfNotGettingTails() {
        assertEquals(0.5, Coin.ChanceOfNotGettingTails, 0);
    }
}