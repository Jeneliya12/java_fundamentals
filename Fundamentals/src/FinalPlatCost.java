public class FinalPlatCost {

    public static void main(String[] args) {
        
        double jioCost = 699.00;
        double gstRate = 0.18;

        double gstAmount = jioCost * gstRate;
        double finalCost = jioCost + gstAmount;
    
        
        System.out.println("********** Final Plat Cost Calculations **********");
        System.out.printf("The GST amount is: ₹%.2f\n", gstAmount);
        System.out.printf("The final cost is: ₹%.2f\n", finalCost);
        System.out.printf("The final cost of the JioSilver plan including 18%% GST is: ₹%.2f\n", finalCost);
    }
}
