
public class InterestAmountAndFinalAmount {

	public static void main(String[] args) {
		double principal = 5000000;
		double rateOfInterest= 6.8;
		int timePeriod = 5;
		
		double simpleInterest = (principal * rateOfInterest * timePeriod)/100;
		
		double finalAmount = principal + simpleInterest;
		
		System.out.println("********** Interest Calculation **********");
        System.out.println("Principal Amount: ₹" + principal);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Time Period: " + timePeriod + " years");
        System.out.println("Simple Interest: ₹" + simpleInterest);
        System.out.println("Final Amount: ₹" + finalAmount);
	}

}
