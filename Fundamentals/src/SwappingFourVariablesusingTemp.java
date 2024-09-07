
public class SwappingFourVariablesusingTemp {

	public static void main(String[] args) {
		int a = 3;
		int b= 4;
		int c = 5;
		int d = 6;
		
		int temp=d;
		
		d = c;
		c = b;
		b= a;
		a= temp;
		
		System.out.println("Value of A : "+ a);
		System.out.println("Value of B : "+ b);
		System.out.println("Value of C : "+ c);
		System.out.println("Value of D : "+ d);
	}

}
