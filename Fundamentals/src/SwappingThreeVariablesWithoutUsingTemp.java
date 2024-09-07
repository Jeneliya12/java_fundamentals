
public class SwappingThreeVariablesWithoutUsingTemp {

	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		int c = 10;
		
		System.out.println("*********  Before Swapping  ***********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		System.out.println("Value of C :" +  c);
		
		c = a + b + c;
		b = c - (a + b);
		a = c - (a + b);
		c = c - (a + b);
		
		System.out.println("**********  After Swapping **********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		System.out.println("Value of C :" +  c);

	}

}
