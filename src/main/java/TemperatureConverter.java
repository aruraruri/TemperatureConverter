public class TemperatureConverter {
    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * (5.0/9.0);
    }

    public static double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public static boolean isExtremeTemperature(double celcius) {
        return celcius >= 50.0 || celcius <= -40.0;
    }

    public static void main(String[] args) {
        System.out.println(celciusToFahrenheit(20.0));
        System.out.println(fahrenheitToCelcius(100.0));
    }
}
