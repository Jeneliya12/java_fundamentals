package flowcontrol;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Enter a Number:");
	int number = scanner.nextInt();
	
	int sum = 0;
	
	for (int i=1; i<=number; i++) {
		if (i%2==0) {
			System.out.println(i);
			sum += i;	
		}
	}
	
	System.out.println("The sum of all Even numbers between 1 and " + number + " is: " + sum);
	scanner.close();
	}

}
