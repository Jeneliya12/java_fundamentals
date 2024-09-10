package flowcontrol;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Fibonacci Series up to " + num + " terms:");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
