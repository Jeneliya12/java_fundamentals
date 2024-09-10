package flowcontrol;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5};
		
		int maxnum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
		if (arr[i]>maxnum) {
			maxnum = arr [i];
		}
		}
		System.out.println(maxnum);
		
	}

}
