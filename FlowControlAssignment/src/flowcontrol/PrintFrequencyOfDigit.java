package flowcontrol;

import java.util.Scanner;

public class PrintFrequencyOfDigit {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int[] frequency = new int[10];

        number = Math.abs(number);

        for (int temp = number; temp > 0; temp /= 10) {
            int digit = temp % 10;  
            frequency[digit]++;    
        }
        System.out.println("Digit frequency in the number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }

}
