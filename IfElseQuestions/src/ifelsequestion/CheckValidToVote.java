package ifelsequestion;

import java.util.Scanner;

public class CheckValidToVote {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your age: ");
	int age = scanner.nextInt();
	
	if(age>=18) {
		System.out.println("You're eligible to Vote");
	}
	else {
		System.out.println("Sorry you're not eligible to Vote");
	}
	scanner.close();
	}

}
