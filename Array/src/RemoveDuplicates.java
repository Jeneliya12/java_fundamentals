import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5};
        
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int value : array) {
            set.add(value);
        }
        
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            uniqueArray[index++] = value;
        }
        
        return uniqueArray;
    }
}
