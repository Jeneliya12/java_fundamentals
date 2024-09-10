package flowcontrol;

import java.util.Scanner;

public class SwapValuesWithoutUsingVariable {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your first number:");
	int num1 = scanner.nextInt();
	
	System.out.print("Enter your second number:");
	int num2 = scanner.nextInt();
	
	System.out.println("Before Swapping: num1= " +num1+ " num2= " +num2);
	
	for(int i=0; i<1; i++) { //num1=1, num2=2
		num1 = num1 + num2; //3
		num2 = num1 - num2; //1
		num1 = num1 - num2; //2
		
	}
	System.out.println("After Swapping: num1= " +num1+ " num2= " +num2);
	}

}
