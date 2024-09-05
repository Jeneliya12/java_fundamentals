package ifelsequestion;

import java.util.Scanner;

public class CheckCharacterType {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		char input = scanner.next().charAt(0);
		
		if(Character.isDigit(input)) {
			System.out.println(input + "is a digit.");
		}
		else if (Character.isLetter(input)) {
			System.out.println(input + "is a alphabet letter.");
		}
		else {
			System.out.println(input + "is a special character.");
		}
		scanner.close();
	}

}
