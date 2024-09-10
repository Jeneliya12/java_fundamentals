package flowcontrol;

import java.util.Scanner; 

public class CheckArmStrongNumberSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int number = 1; number <= n; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrong(int number) {
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

        return result == originalNumber;
    }
}
