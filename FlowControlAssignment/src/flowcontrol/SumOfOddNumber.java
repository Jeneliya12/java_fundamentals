package flowcontrol;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter your odd number");
	int number = scanner.nextInt();
	
	int sum = 0;
	
	for(int i=1; i<=number; i++) {
		if(!(i%2 ==0)) {
			System.out.println(i);
			sum += i;
			
		}
	}
	System.out.println("The sum of odd numbers between 1 to " +number+ " is: " +sum);
	scanner.close();
	}

}
