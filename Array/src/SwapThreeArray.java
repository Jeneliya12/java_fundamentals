import java.util.Arrays;

public class SwapThreeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};
        
        System.out.println("Before swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        
        swapArrays(array1, array2, array3);
        
        System.out.println("\nAfter swapping:");
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
    }
    
    public static void swapArrays(int[] array1, int[] array2, int[] array3) {
        if (array1.length != array2.length || array2.length != array3.length || array1.length !=array3.length ) {
            throw new IllegalArgumentException("Arrays must have the same length to be swapped.");
        }
        
        int[] temp = new int[array1.length];
        
        System.arraycopy(array1, 0, temp, 0, array1.length);
        
        System.arraycopy(array2, 0, array1, 0, array2.length);
        
        System.arraycopy(array3, 0, array2, 0, array3.length);
        
        System.arraycopy(temp, 0, array3, 0, temp.length);
    }
}
