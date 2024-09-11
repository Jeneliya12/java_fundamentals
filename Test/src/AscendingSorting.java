
public class AscendingSorting {

	public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        bubbleSort(array);

        System.out.println("Sorted array in ascending order:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
