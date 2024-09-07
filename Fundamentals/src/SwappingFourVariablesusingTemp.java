public class SwappingFourVariablesusingTemp {

	public static void main(String[] args) {
		int a = 3;
		int b= 4;
		int c = 5;
		int d = 6;
		
        System.out.println("********* Before Swapping *********");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
        
        
		int temp=a;
		
		a = b;
		b = c;
		c = d;
		d = temp;
		
		System.out.println("********* After Swapping *********");
		System.out.println("Value of A : "+ a);
		System.out.println("Value of B : "+ b);
		System.out.println("Value of C : "+ c);
		System.out.println("Value of D : "+ d);
	}

}
