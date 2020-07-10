package Task2;

public class Main {
    public static void main(String args[]) {
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        KelvinConverter kelvin = new KelvinConverter();
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit.convert(20));
        System.out.println("Temperature in Kelvins is: " + kelvin.convert(20));
    }
}
