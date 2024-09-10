package flowcontrol;

import java.util.Scanner;

public class SwapFirstAndLastDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
      
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }
        
        int lastDigit = number % 10;
        int firstDigit = 0;
        int numDigits = 0;
        
        for (int temp = number; temp != 0; temp /= 10) {
            numDigits++;
            if (temp < 10) {
                firstDigit = temp;
            }
        }
        
        if (numDigits == 1) {
            System.out.println("The number is a single-digit number. No swap needed.");
            return;
        }
        
        int newNumber = lastDigit; 
        
        for (int temp = number / 10; temp != 0; temp /= 10) {
            newNumber = newNumber * 10 + (temp % 10);
        }
        
        newNumber = newNumber * 10 + firstDigit; 
        
        if (isNegative) {
            newNumber = -newNumber;
        }
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Number after swapping first and last digits: " + newNumber);
    }
}
