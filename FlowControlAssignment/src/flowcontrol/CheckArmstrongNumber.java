package flowcontrol;

import java.util.Scanner; 

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int result = 0;
        int digits = 0;


        for (int temp = originalNumber; temp != 0; temp /= 10) {
            digits++;
        }

   
        for (int temp = originalNumber; temp != 0; temp /= 10) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
        }

       
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
