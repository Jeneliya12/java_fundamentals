public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99};

        int secondSmallest = findSecondSmallest(array);

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("Array does not have enough distinct elements.");
        }
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            return Integer.MAX_VALUE; 
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value < smallest) {
                secondSmallest = smallest; 
                smallest = value; 
            } else if (value > smallest && value < secondSmallest) {
                secondSmallest = value; 
            }
        }

        return secondSmallest;
    }
}
