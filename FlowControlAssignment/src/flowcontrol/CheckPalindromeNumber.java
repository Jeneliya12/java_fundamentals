package flowcontrol;

import java.util.Scanner;

public class CheckPalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int reversedNumber = 0;
        
        for (; number != 0; number /= 10) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
