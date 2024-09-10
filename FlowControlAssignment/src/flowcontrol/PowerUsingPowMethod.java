package flowcontrol;

import java.util.Scanner;

public class PowerUsingPowMethod {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of times you want to find the power of a number for: ");
		int numberOfTimesOfPower = scanner.nextInt();
		
		
		for (int i=1; i<=numberOfTimesOfPower; i++) {
			System.out.println("Enter the base of a number: ");
			int base = scanner.nextInt();
			
			System.out.println("Enter the exponent of a number: ");
			int exponent = scanner.nextInt();
			
			double result = Math.pow(base, exponent);
			System.out.println(base + " raised to the power of " +exponent+ " is: " +result);
		}
		scanner.close();
		
	}
	

}
