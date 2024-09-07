package ifelsequestion;
import java.util.Scanner;

public class CheckDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a digit");
		char input = scanner.next().charAt(0);
		 
		if (Character.isDigit(input)) {
			System.out.println(input + "is a digit.");
		}
		else {
			System.out.println(input + "is not a digit.");
			
		}
		scanner.close();
	}
	
}
