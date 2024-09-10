package flowcontrol;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the base value: ");
		int base = scanner.nextInt();
		
		System.out.print("Enter the exponent value: ");
		int exponent = scanner.nextInt();
		scanner.close();
		
		int result = 1;
		
		for (int i=1; i<=exponent; i++) {
			result *= base;
			
		}
		
		System.out.println(base +" raised to the power " +exponent+ " is: " +result);
	}

}
