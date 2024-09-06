package ifelsequestion;

import java.util.Scanner;

public class CheckDaysForMonth {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter month between 1-12");
	int month = scanner.nextInt();
	
	System.out.print("Enter the year");
	int year = scanner.nextInt();
	
	if(month == 1) {
		System.out.println("it has 30 days");
	}
	else if(month == 2) {
		if (isLeapYear(year)) {
			System.out.println("it has 29 days");
		}
		else {
			System.out.println("it has 28 days");
		}
	}
	else if (month == 3) {
		System.out.println("it has 31 days");
	}
	else if (month == 4) {
		System.out.println("it has 30 days");
	}
	else if (month == 5) {
        System.out.println("May has 31 days.");
    } 
	else if (month == 6) {
        System.out.println("June has 30 days.");
    } 
	else if (month == 7) {
        System.out.println("July has 31 days.");
    } 
	else if (month == 8) {
        System.out.println("August has 31 days.");
    } 
	else if (month == 9) {
        System.out.println("September has 30 days.");
    } 
	else if (month == 10) {
        System.out.println("October has 31 days.");
    } 
	else if (month == 11) {
        System.out.println("November has 30 days.");
    } 
	else if (month == 12) {
        System.out.println("December has 31 days.");
    } 
	else {
        System.out.println("Invalid input! Please enter a number between 1 and 12.");
    }
	scanner.close();
	}
	public static boolean isLeapYear(int year) {
		return (year % 4 ==0 && year % 100 !=0) || (year % 400 == 0);			
	}
	

}
