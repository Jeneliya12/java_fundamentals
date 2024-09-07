
public class SwappingTwoVaiablesUsingTemp {
//Swapping two variables using temp
	public static void main(String[] args) {
		int a = 3;
		int b= 4;
		
		System.out.println("*********  Before Swapping  ***********");
		System.out.println("Value of A :" +  a);
		System.out.println("Value of B :" +  b);
		
		int temp=a;
		
		a = b;
		b= temp;
		
		System.out.println("*********  After Swapping  ***********");
		System.out.println("Value of A : "+ a);
		System.out.println("Value of B : "+ b);
		}
		
	}



