package flowcontrol;

import java.util.Scanner;

public class LCMofTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        
        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int findHCF(int num1, int num2) {
        int hcf = 1;
        int min = Math.min(num1, num2);

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; 
            }
        }

        return hcf;
    }

    public static int findLCM(int num1, int num2) {
        int hcf = findHCF(num1, num2);
        return (num1 * num2) / hcf;
    }
}
