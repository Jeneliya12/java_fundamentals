package flowcontrol;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter your Number: ");
		int number = scanner.nextInt();
		
		 for (int i = number; i >= 1; i--) {
	            System.out.println(i);
	        }


	}

}
