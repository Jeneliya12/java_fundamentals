import java.util.ArrayList;
import java.util.Arrays;

public class SeparateEvenOdd {
    public static void main(String[] args) {
        int[] array = {12, 34, 5, 7, 23, 40, 11, 10, 45};
       
        int[] separatedArray = separateEvenOdd(array);

        System.out.println("Array with even numbers first and odd numbers after:");
        System.out.println(Arrays.toString(separatedArray));
    }

    public static int[] separateEvenOdd(int[] array) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        
        for (int num : array) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        int[] result = new int[array.length];
        int index = 0;

        for (int even : evens) {
            result[index++] = even;
        }

        for (int odd : odds) {
            result[index++] = odd;
        }

        return result;
    }
}
