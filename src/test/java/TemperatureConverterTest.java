import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void fahrenheitToCelcius() {
        assertEquals(37.77, TemperatureConverter.fahrenheitToCelcius(100.0), 0.1);
    }

    @Test
    void celciusToFahrenheit() {
        assertEquals(68.0, TemperatureConverter.celciusToFahrenheit(20.0), 0.1);
    }

    @Test
    void isExtremeTemperature() {
        assertFalse(TemperatureConverter.isExtremeTemperature(30.0));
    }
}