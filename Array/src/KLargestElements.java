import java.util.PriorityQueue;
import java.util.Arrays;

public class KLargestElements {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        int[] kLargest = findKLargest(array, k);
        
        System.out.println("The " + k + " largest elements are:");
        System.out.println(Arrays.toString(kLargest));
    }

    public static int[] findKLargest(int[] array, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for (int num : array) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
