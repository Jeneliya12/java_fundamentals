package flowcontrol;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Prime factors of " + number + " are:");

        printPrimeFactors(number);
    }
    
    public static void printPrimeFactors(int number) {
        while (number % 2 == 0) {
            System.out.print(2 + " ");
            number /= 2;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 2) {
            System.out.print(number);
        }
    }
}
