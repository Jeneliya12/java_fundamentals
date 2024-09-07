
public class SwappingThreeVariablesUsingTemp {

	public static void main(String[] args) {
		
	int a = 3;
	int b= 4;
	int c = 5;
	
	int temp=a;
	
	a = b;
	b = c;
	c= temp;
	
	System.out.println("Value of A : "+ a);
	System.out.println("Value of B : "+ b);
	System.out.println("Value of C : "+ c);
	}
	

}
