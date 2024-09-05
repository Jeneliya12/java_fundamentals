package ifelsequestion;

import java.util.Scanner;
public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Number");
		int input = scanner.nextInt();
		
		if(input > 0) {
			System.out.println(input + "is a positive number");
		}
		else {
			System.out.println(input + "is a negative number");
		}
	}

}
