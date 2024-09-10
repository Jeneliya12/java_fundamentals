package flowcontrol;

public class SumOfAllPrimeNumbers {

	public static void main(String[] args) {

		int n = 100;
		int sum = 0;
		
		System.out.println("Prime numbers between 1 and " +n + ":");
		
		for (int number = 2; number <=n; number++) {
			if (isPrime(number)) {
				System.out.println(number);
				sum += number;
			}	
	}
		System.out.println("The sum all prime numbers between 1 and " + n + ": " + sum);

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

	