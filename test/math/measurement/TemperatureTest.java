package math.measurement;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    @Test
    public void shouldCompareTwoEquivalentTemperatureOfCelsiusAndFahrenheitAsEqual() {
        final Temperature celsius = new Temperature(100, TemperatureUnit.CELSIUS);
        final Temperature fahrenheit = new Temperature(212,
                TemperatureUnit.FAHRENHEIT);
        assertTrue(celsius.equivalentTo(fahrenheit));
    }
    @Test
    public void shouldCompareTwoDifferentTemperatureOfCelsiusAndFahrenheitAsNotEqual() {
        final Temperature celsius = new Temperature(10, TemperatureUnit.CELSIUS);
        final Temperature fahrenheit = new Temperature(212,
                TemperatureUnit.FAHRENHEIT);
        assertFalse(celsius.equivalentTo(fahrenheit));
    }
}