package ifelsequestion;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        if (Double.isNaN(fahrenheit)) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } else {
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        }
        scanner.close();
    }
}
