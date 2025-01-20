package ptf.rs;

public class Convertor {

    public static double inchToCm(double inches) {
        if(Double.compare(inches, 0) < 0) {
            throw new IllegalArgumentException("Argument cannot be negative");
        }
        return inches * 2.54;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8d;
    }
}
