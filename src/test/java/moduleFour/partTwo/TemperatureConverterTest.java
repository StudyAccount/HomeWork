package moduleFour.partTwo;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 07.04.2016.
 */
public class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;

    @BeforeClass
    public static void setUpClass() throws Exception {
        temperatureConverter = new TemperatureConverter();
    }

    @Test (timeout = 1000)
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float celsius = 0;
        float expectation = 32;

        Temperature temperature = new Temperature(celsius);

        final float result = temperatureConverter.convertCelsiusToFahrenheit(temperature);
        assertEquals(expectation, result, 0.0f);

    }

    @Test (timeout = 1000)
    public void testConvertFahrenheitToCelsius() throws Exception {
        float fahrenheit = 32;
        float expectation = 0;

        Temperature temperature = new Temperature(fahrenheit);

        final float result = temperatureConverter.convertFahrenheitToCelsius(temperature);
        assertEquals(expectation, result, 0.0f);
    }
}