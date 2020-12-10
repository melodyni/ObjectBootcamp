package math.shapes;

import math.exceptions.InvalidDimensionException;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void shouldCalculateAreaOfRectangle() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(6, rectangle.area(),0);
    }

    @Test
    public void shouldCalculateAreaOfRectangleWithDimensionInFloat() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2.5, 2.5);
        assertEquals(6.25, rectangle.area(),0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangle() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(10, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangleWithDimensionInFloat() throws InvalidDimensionException {
        Rectangle rectangle = Rectangle.create(2.5, 3.7);
        assertEquals(12.4, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldThrowExceptionForInvalidBreadth(){
        assertThrows(InvalidDimensionException.class, ()-> Rectangle.create(2, -3));
    }

    @Test
    public void shouldThrowExceptionForInvalidLength(){
        assertThrows(InvalidDimensionException.class, ()-> Rectangle.create(-2, 3));
    }

    @Test
    public void shouldThrowExceptionForInvalidDimensions(){
        assertThrows(InvalidDimensionException.class, ()-> Rectangle.create(-2, -3));
    }

    @Test
    public void shouldThrowExceptionForZeroAsDimension(){
        assertThrows(InvalidDimensionException.class, ()-> Rectangle.create(-2, -3));
    }
}