package math.shapes;

import math.exceptions.InvalidDimensionException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
 /*   @Test
    public void shouldThrowExceptionForInvalidSide() {
        assertThrows(InvalidDimensionException.class, () -> Square.create(-3));
    }

    @Test
    public void shouldThrowExceptionForZeroAsSide() {
        assertThrows(InvalidDimensionException.class, () -> Square.create(0));
    }
*/
    @Test
    public void shouldCalculateAreaOfSquare() throws InvalidDimensionException {
        Square square = Square.create(3);
        assertEquals(9, square.area(), 0);
    }

    @Test
    public void shouldCalculateAreaOfSquareWithDimensionsInFloat() throws InvalidDimensionException {
        Square square = Square.create(3.5);
        assertEquals(12.25, square.area(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfSquare() throws InvalidDimensionException {
        Square square = Square.create(3);
        assertEquals(12, square.perimeter(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfSquareWithDimensionsInFloat() throws InvalidDimensionException {
        Square square = Square.create(3.5);
        assertEquals(14, square.perimeter(), 0);
    }
}