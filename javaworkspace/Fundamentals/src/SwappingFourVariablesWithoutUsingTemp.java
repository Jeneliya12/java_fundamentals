
public class SwappingFourVariablesWithoutUsingTemp {

	public static void main(String[] args) {
		int a = 8;
		int b = 9;
		int c = 10;
		int d = 11;
		
		System.out.println("*********  Before Swapping  ***********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		System.out.println("Value of C :" +  c);
		System.out.println("Value of D :" +  d);
		d = a + b + c + d; //a becomes 27 (8 + 9 + 10)
		c = d - (a + b + c);
		b = d - (a + b + c);
		a = d - (a + b + c);
		d = d - (a + b + c);
		
		System.out.println("**********  After Swapping **********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		System.out.println("Value of C :" +  c);
		System.out.println("Value of D :" +  d);
	}

}
