package flowcontrol;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your digit: " );
		int digit = scanner.nextInt();
		
		int sum = 0;
		
		for (; digit!=0; digit /= 10) {
			sum += digit % 10;
		}
		System.out.println("Sum of digits: " + sum);
		scanner.close();
	}

}
