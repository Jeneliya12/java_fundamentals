import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

public class KSmallestElements {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int k = 3;
       
        int[] kSmallest = findKSmallest(array, k);
       
        System.out.println("The " + k + " smallest elements are:");
        System.out.println(Arrays.toString(kSmallest));
    }

    public static int[] findKSmallest(int[] array, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
        
        for (int num : array) {
            if (maxHeap.size() < k) {
                maxHeap.add(num);
            } else if (num < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(num);
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
