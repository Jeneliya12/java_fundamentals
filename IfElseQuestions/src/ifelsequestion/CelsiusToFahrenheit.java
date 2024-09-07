package ifelsequestion;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit;
		
		if(Double.isNaN(celsius)) {
			System.out.print("Invalid input. Please enter a numeric value");
		}
		else {
			fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		}
		scanner.close();
	}

}
