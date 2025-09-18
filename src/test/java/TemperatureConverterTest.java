import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    temperatureConverter temperatureConverter = new temperatureConverter();

    @Test
    void fahrenheitToCelcius() {
        assertEquals(37.77, temperatureConverter.fahrenheitToCelcius(100.0), 0.1);
    }

    @Test
    void hundredThousandFahrenheit() {assertEquals(55537.7778, temperatureConverter.fahrenheitToCelcius(100000.0), 0.1);}

    @Test
    void minusHundredThousandFahrenheit() {assertEquals(-55573.3333, temperatureConverter.fahrenheitToCelcius(-100000.0), 0.1);}


    @Test
    void celciusToFahrenheit() {
        assertEquals(68.0, temperatureConverter.celciusToFahrenheit(20.0), 0.1);
    }

    @Test
    void hundredThousandCelcius() {
        assertEquals(180032.0, temperatureConverter.celciusToFahrenheit(100000.0), 0.1);
    }

    @Test
    void minusHundredThousandCelcius() {
        assertEquals(-179968, temperatureConverter.celciusToFahrenheit(-100000.0), 0.1);
    }

    @Test
    void isWarmTemperature() {
        assertFalse(temperatureConverter.isExtremeTemperature(30.0));
    }

    @Test
    void isExtremeHotTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(50.0));
    }

    @Test
    void isVeryExtremeHotTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(70.0));
    }

    @Test
    void isColdTemperature() { assertFalse(temperatureConverter.isExtremeTemperature(-39.0));
    }

    @Test
    void isExtremeColdTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-40.0));
    }

    @Test
    void isVeryExtremeColdTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-70.0));
    }

    @Test
    void bigKelvinToC() {
        assertEquals(9726.85, temperatureConverter.kelvinToCelcius(10000.0));
    }

    @Test
    void zeroKelvinToC() {
        assertEquals(-273.15, temperatureConverter.kelvinToCelcius(0));
    }

}