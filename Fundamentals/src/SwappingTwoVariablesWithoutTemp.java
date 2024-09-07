
public class SwappingTwoVariablesWithoutTemp {
//swapping two variables without using temp
	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		
		System.out.println("*********  Before Swapping  ***********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		
		a = a + b; 
		b = a - b; 
		a = a - b;
		
		System.out.println("**********  After Swapping  **********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
	}

}
