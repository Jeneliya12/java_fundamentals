package ifelsequestion;

public class MaximumNumberAmongThreeNumbers {

	public static void main(String[] args) {
	
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		
		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			System.out.println("maximum number is : " + firstNumber);
		}
		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			System.out.println("maximum number is : " + secondNumber);
		}
		else {
			System.out.println("maximum number is : " + thirdNumber);
		}
	}

}
