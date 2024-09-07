package flowcontrol;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter any Number to Find the multiplication table: ");
	int number = scanner.nextInt();
	
	for (int i=1; i<=10; i++) {
		System.out.println(number + "x" + i + "=" + (number*i));
	}
		
	}

}
