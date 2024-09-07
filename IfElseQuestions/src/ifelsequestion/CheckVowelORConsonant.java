package ifelsequestion;
import java.util.Scanner;

public class CheckVowelORConsonant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter An Alphabet");
		char ch = scanner.next().charAt(0);
		
		if(!Character.isLetter(ch)) {
			System.out.println("Invalid Input");
		}
		else {
			ch = Character.toLowerCase(ch);
			if(ch == 'a' || ch== 'e' || ch == 'i' || ch =='o' || ch == 'u') {
				System.out.println(ch + "is a vowel");
			}
			else {
				System.out.println(ch + "is not a vowel");
			}
		}
		scanner.close();
		
	}

}
