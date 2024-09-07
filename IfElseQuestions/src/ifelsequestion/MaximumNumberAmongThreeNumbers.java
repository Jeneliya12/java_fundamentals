package ifelsequestion;

public class MaximumNumberAmongThreeNumbers {

	public static void main(String[] args) {
		
		int maxNum;
		int firstNumber = 10;
		int secondNumber = 20;
		int thirdNumber = 30;
		
		if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
			maxNum = firstNumber;
		}
		else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
			maxNum = secondNumber;
		}
		else {
			maxNum = thirdNumber;
		}

        System.out.println("Maximum number is : " + maxNum);
	}

}
