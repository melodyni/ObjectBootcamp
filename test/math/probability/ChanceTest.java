package math.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {

    @Test
    public void shouldRepresentChanceOfNotGettingTailsOnFlippingACoin() {
        Chance chance = new Chance(0.5);
        assertEquals(0.5, chance.complement(),0);
    }
}