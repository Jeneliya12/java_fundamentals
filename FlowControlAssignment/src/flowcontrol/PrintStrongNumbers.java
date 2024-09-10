package flowcontrol;

public class PrintStrongNumbers {

    public static void main(String[] args) {
        int n = 500; // You can change this value to any upper limit

        System.out.println("Strong numbers between 1 and " + n + ":");

        for (int number = 1; number <= n; number++) {
            if (isStrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += factorial(digit); // Add factorial of the digit to sum
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber;
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
