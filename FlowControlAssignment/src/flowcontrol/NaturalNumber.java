package flowcontrol;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Enter a Number: ");
	int number = scanner.nextInt();
	
	System.out.println("Natural Numbers from 1 to " + number + ":");
	for (int i=1; i<=number; i++) {
		System.out.println(i);
	}
	scanner.close();
	}

}
