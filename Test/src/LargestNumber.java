
public class LargestNumber {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		int LarNum = array[0];
		
		for(int i=1; i<array.length; i++) {
			if (array[i]>LarNum) {
				LarNum = array[i];
			}
		}
		System.out.println("The largest Number is: " +LarNum);
		
	}

}
