
public class GrossAmountAndNetAmount {

	public static void main(String[] args) {
		 // Basic salary
        double basicSalary = 85000;

        // Calculate TA, DA, HRA
        double ta = basicSalary * 0.15; // 15% of basic salary
        double da = basicSalary * 0.20; // 20% of basic salary
        double hra = basicSalary * 0.18; // 18% of basic salary

        // Calculate Gross Salary
        double grossSalary = basicSalary + ta + da + hra;

        // Calculate PF and Tax
        double pf = basicSalary * 0.20; // 20% of basic salary
        double tax = basicSalary * 0.25; // 25% of basic salary

        // Calculate Net Salary
        double netSalary = grossSalary - (pf + tax);

        // Display the results
        System.out.println("********** Salary Calculation **********");
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("TA (15%): ₹" + ta);
        System.out.println("DA (20%): ₹" + da);
        System.out.println("HRA (18%): ₹" + hra);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("PF (20%): ₹" + pf);
        System.out.println("Tax (25%): ₹" + tax);
        System.out.println("Net Salary: ₹" + netSalary);

	}

}
