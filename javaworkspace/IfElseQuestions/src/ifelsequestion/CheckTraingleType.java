package ifelsequestion;

import java.util.Scanner;

public class CheckTraingleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to input the lengths of the three sides of the triangle
        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        // Checking if the inputs form a valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            // Checking if the triangle is equilateral, isosceles, or scalene
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The lengths provided do not form a valid triangle.");
        }

        scanner.close();
    }
}
