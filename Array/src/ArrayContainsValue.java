import java.util.Scanner;

public class ArrayContainsValue {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the value to search for: ");
		int valueToFind = scanner.nextInt();
		
		boolean hasValue = Value(array, valueToFind);
		
		if(hasValue) {
			System.out.println("The array has value " +valueToFind);
		}
		else {
			System.out.println("The array does not have value " +valueToFind);
		}
		scanner.close();
	}
	public static boolean Value(int[] array, int value) {
		for (int i=0; i< array.length; i++) {
			if(array[i]==value) {
				return true;
			}
		}
		return false;
	}
}


