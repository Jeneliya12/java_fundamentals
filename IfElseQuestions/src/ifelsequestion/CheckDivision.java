package ifelsequestion;

import java.util.Scanner;

public class CheckDivision {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your total Marks:");
		int totalMarks = scanner.nextInt();
		
		System.out.print("Enter the Marks Obtained");
		int marksObtained = scanner.nextInt();
		
		double percentage = (double) marksObtained/totalMarks*100;
		
		if(percentage >= 60) {
			System.out.println("Your Percentage:-" + percentage + "% \t Division 1st");
		}
		else if (percentage >=45) {
			System.out.println("Your Percentage:-" + percentage + "%  \t Division 2nd");
		}
		else if (percentage >=30) {
			System.out.println("Your Percentage:-" + percentage + "%  \t Division 3rd");
		}
		else {
			System.out.println("Your Percentage:-" + percentage + "%  \t Fail");
		}
		scanner.close();
	}

}
