public class Main {
    public static void main(String[] args) {
        temperatureConverter tempConv = new temperatureConverter();

        System.out.println(tempConv.celciusToFahrenheit(20.0));
        System.out.println(tempConv.fahrenheitToCelcius(100.0));

        System.out.println(tempConv.fahrenheitToCelcius(-100000));

    }
}
