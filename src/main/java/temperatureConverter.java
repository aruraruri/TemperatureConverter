public class temperatureConverter {
    public double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0/9.0);
    }

    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public double  kelvinToCelcius(double kelvin) {
        return kelvin - 273.15;
    }

    public boolean isExtremeTemperature(double celcius) {
        return celcius >= 50.0 || celcius <= -40.0;
    }
}
