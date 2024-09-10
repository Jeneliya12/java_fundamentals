package flowcontrol;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Display the input prompt
        System.out.print("Enter your digit: ");
        String input = scanner.next();

        // Check if the input is numeric
        if (!input.matches("\\d+")) {
            System.out.println("Invalid input. Please enter only digits.");
        } else {
            // If the input is numeric, proceed to count the digits
            int count = 0;

            // Iterate over each character in the string
            for (int i = 0; i < input.length(); i++) {
                // Check if the character is a digit (though we've already validated this)
                if (Character.isDigit(input.charAt(i))) {
                    count += 1;  // Increment the count for each digit
                }
            }
            
            System.out.println("Number of digits: " + count);
        }

        // Close the scanner
        scanner.close();
    } 
}
