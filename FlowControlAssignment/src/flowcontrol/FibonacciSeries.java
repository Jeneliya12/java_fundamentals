package flowcontrol;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + num + " terms:");

        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
