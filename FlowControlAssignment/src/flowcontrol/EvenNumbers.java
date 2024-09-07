package flowcontrol;

public class EvenNumbers {

	public static void main(String[] args) {
		int maxNum = 100;
		
		for (int i=1; i<=maxNum; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
