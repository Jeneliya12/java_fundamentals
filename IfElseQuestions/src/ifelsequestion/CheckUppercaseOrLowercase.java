package ifelsequestion;

import java.util.Scanner;

public class CheckUppercaseOrLowercase {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please Enter an Alphabet");
	char ch = scanner.next().charAt(0);
	
	if(Character.isLowerCase(ch)){
	System.out.println("the input is lowercase" );
	}
	else if(Character.isUpperCase(ch)) {
		System.out.print("the input is uppercase" );
	} else {
		System.out.println("the input is not an alphabet");
	}
	scanner.close();
	}
}
