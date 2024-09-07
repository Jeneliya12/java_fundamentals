package ifelsequestion;

import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter an alphabet: ");
		char input = scanner.next().charAt(0);
		
		if (Character.isLetter(input)) {
			System.out.println(input +" it is an alphabet letter.");
		}
		else {
			System.out.println(input +" it is not an alphabet letter.");
		}
		scanner.close();
	}

}
