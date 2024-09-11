
public class AverageValueOfArray {

	public static void main(String[] args) {
	int[] array = {1, 2, 3, 4, 5};
	
	int sum = 0;
	for(int i=0; i<array.length; i++) {
		sum+=array[i];
	
	}
	int avg = (sum/array.length);
	System.out.println("The total sum of the array is: " +sum);
	System.out.println("The average of the total is: " + avg);
	}

}
