public class CheckIndex {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		
		int valueToFind = 30;
		int index = -1;
		
		for(int i=0; i<array.length; i++) {
			if (array[i] == valueToFind) {
				index = i;
				break;
			}
		}
		if (index!=-1) {
			System.out.println("Value " +valueToFind + " found at index: " + index);
		} else {
			System.out.println("Value " + valueToFind + " not found in the array.");
		}
		
	}

}
