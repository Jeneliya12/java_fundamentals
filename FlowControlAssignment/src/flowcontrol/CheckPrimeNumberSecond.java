package flowcontrol;

public class CheckPrimeNumberSecond {

	public static void main(String[] args) {
	
		int n = 100;
		
		System.out.println("Prime numbers between 1 and " +n + ":");
		
		for (int number = 2; number <=n; number++) {
			if (isPrime(number)) {
				System.out.println(number);
			}
		
	}

}
	public static boolean isPrime(int num) {
		if (num <=1) {
			return false;
		}
		for (int i =2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
