package flowcontrol;

import java.util.Scanner;

public class CheckPerfectNumberSecond {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	scanner.close();
	
	if(isPerfect(number)) {
		System.out.println(number + " is a perfect number.");
	}
	else {
		System.out.println(number + " is not a perfect number.");
	}
}
	
	public static boolean isPerfect(int number) {
		if(number <= 1) {
			return false;
		}
		int sum = 0;
		for (int i =1; i <=number/2; i++) {
			if(number%2 == 0) {
				sum += number;
			}
		}
		return sum == number;
	}

}
