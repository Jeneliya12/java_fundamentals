import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {

    public static void main(String[] args) {
        Integer[] array = {50, 20, 40, 10, 30};

        System.out.println("Original array:");
        printArray(array);

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Array after sorting in descending order:");
        printArray(array);
    }
    public static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
