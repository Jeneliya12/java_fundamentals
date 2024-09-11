import java.util.Arrays;

public class SortArrayAscending {

    public static void main(String[] args) {
        int[] array = {50, 20, 40, 10, 30};

        System.out.println("Original array:");
        printArray(array);
        
        Arrays.sort(array);

        System.out.println("Array after sorting in ascending order:");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
