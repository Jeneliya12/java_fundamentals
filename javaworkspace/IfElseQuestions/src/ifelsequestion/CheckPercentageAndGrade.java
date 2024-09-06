package ifelsequestion;

import java.util.Scanner;

public class CheckPercentageAndGrade {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Please your marks of Maths:-");
	int mark1 = scanner.nextInt();
	
	System.out.print("Please your marks of Physics:-");
	int mark2 = scanner.nextInt();
	
	System.out.print("Please your marks of Chemistry:-");
	int mark3 = scanner.nextInt();
	
	System.out.print("Please your marks of English:-");
	int mark4 = scanner.nextInt();
	
	System.out.print("Please your marks of Hindi:-");
	int mark5 = scanner.nextInt();
	
	int maxMarks = 100; //maximum marks for each subjects
	
	int totalMarksObtained = mark1 + mark2 + mark3 + mark4 + mark5;
	int maxTotalMarks = 100 * 5;
	double percentage = (double) totalMarksObtained/maxTotalMarks * 100;
	
	System.out.println("********** Percentage and Grade Calculation **********");
	
	if(percentage >= 90) {
		System.out.println("Congratulation, you got " + percentage + "%  and grade A");
	}
	else if(percentage >= 80) {
		System.out.println("Congratulation, you got " + percentage + "%  and grade B");
	}
	else if(percentage >= 70) {
		System.out.println("Congratulation, you got " + percentage + "%  and  grade C");
	}
	else if(percentage >= 60) {
		System.out.println("Congratulation, you got " + percentage + "%  and  grade D");
	}
	else if(percentage >= 40) {
		System.out.println("Congratulation, you got " + percentage + "%  and grade E");
	}
	else {
		System.out.println("Congratulation, you got " + percentage + "%  and grade F");
	}
	scanner.close();
}

}
