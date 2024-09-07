
public class SwappingTwoVariablesWithoutTemp {
//swapping two variables without using temp
	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		
		System.out.println("*********  Before Swapping  ***********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		
		a = a + b; //a becomes 17 (8 + 9)
		b = a - b; //b becomes 8 (17 - 9)
		a = a - b; //a becomes 9 (17 - 8)
		
		System.out.println("**********  After Swapping  **********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
	}

}
