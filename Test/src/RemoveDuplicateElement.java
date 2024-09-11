import java.util.Arrays;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        int[] tempArray = new int[array.length];
        int size = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (array[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[size++] = array[i];
            }
        }
        int[] uniqueArray = Arrays.copyOf(tempArray, size);

   
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
