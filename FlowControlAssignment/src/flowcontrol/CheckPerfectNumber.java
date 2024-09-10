package flowcontrol;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		int number = 6;
		if(isPerfect(number)) {
			System.out.println(number + " is a perfect number.");
		}
		else {
			System.out.println(number + " is not a perfect number.");
		}
	}
	public static boolean isPerfect(int number) {
		if (number<=1) return false;
		
		int sum =0;
		
		for(int i=1; i<=number/2; i++) {
			if(number%i==0) {
				sum += i;
			}
		}
		return sum == number;
		}
	
	}