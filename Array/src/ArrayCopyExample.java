import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        
        int[] destinationArray1 = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray1[i] = sourceArray[i];
        }
        System.out.println("Manual Copy Using Loop: " + Arrays.toString(destinationArray1));
    }
}
