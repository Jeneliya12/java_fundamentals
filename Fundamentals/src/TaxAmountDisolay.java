public class TaxAmountDisolay {

	public static void main(String[] args) {
		double Salary = 85000.00;
		double taxRate = 0.20;
		double taxAmount = taxRate * Salary;
		double netSalary = Salary - taxAmount;
		
		System.out.println("**********  Final Result of tax amount and net salary  **********");
		System.out.printf("The tax amount display to that amount is: %.2f \n", taxAmount);
		System.out.printf("The net salary after reducing tax amount is: %.2f", netSalary);	
	}

}
