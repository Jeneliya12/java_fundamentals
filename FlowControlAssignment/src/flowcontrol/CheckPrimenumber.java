package flowcontrol;

import java.util.Scanner;

public class CheckPrimenumber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter a Prime Number: ");
	int number = scanner.nextInt();
	scanner.close();
	
	if(number <=1) {
		System.out.println(number + "is not a prime number");
	}
	else {
		boolean isPrime = true;
	
		for(int i=2; i<=Math.sqrt(number);i++) {
			if (number%i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + "is a Prime Number.");
		}
		else {
			System.out.print((number + "is not a Prime Number"));
		}
	
		}

	}
}
