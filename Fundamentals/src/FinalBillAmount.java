
public class FinalBillAmount {

	public static void main(String[] args) {
		double pricePerPizza = 399.0;
		int numberOfPizzas = 2;
		double discountRate = 0.20;
	
		double totalCost = pricePerPizza * numberOfPizzas;
		
		double discountAmount = totalCost * discountRate;
		
		double finalBill =  totalCost - discountAmount;
		
		System.out.println("********** Pizza Bill **********");
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Discount: ₹" + discountAmount);
        System.out.println("Final Bill Amount: ₹" + finalBill);

	}

}
