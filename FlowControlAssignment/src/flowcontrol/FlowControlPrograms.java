package flowcontrol;
import java.util.Scanner;

public class FlowControlPrograms {

	public static void main(String[] args) {
		printEvenNumbers(100);  
        System.out.println("\n------------------\n");
        multiplicationTable();  
        System.out.println("\n------------------\n");
        printNaturalNumbers(100); 
        System.out.println("\n------------------\n");
        printOddNumbers(100); 
		
	}
	 public static void printEvenNumbers(int maxNum) {
	        System.out.println("Even numbers up to " + maxNum + ":");
	        for (int i = 1; i <= maxNum; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to print odd numbers
	    public static void printOddNumbers(int maxNum) {
	        System.out.println("Odd numbers up to " + maxNum + ":");
	        for (int i = 1; i <= maxNum; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }
	    }

	    // Method to generate multiplication table
	    public static void multiplicationTable() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter any number to find the multiplication table: ");
	        int number = scanner.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        scanner.close();
	    }

	    // Method to print natural numbers
	    public static void printNaturalNumbers(int maxNum) {
	        System.out.println("Natural numbers up to " + maxNum + ":");
	        for (int i = 1; i <= maxNum; i++) {
	            System.out.println(i);
	        }
	    }
}
