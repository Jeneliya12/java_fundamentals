package flowcontrol;

import java.util.Scanner;

public class SwapUsingThirfVariable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println("Before swapping: num1 = " +num1+ " num2 = " +num2);
		
		for (int i=0; i<1; i++) {
			int temp = num1;
			num1 = num2;
			num2 = temp;	
			
		}
		System.out.println("After swapping: num1 = " +num1+ " num2 = " +num2);

	}

}