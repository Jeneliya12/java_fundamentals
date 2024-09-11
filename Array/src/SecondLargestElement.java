public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 4, 45, 99};
        
        int secondLargest = findSecondLargest(array);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("Array does not have enough distinct elements.");
        }
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > largest) {
                secondLargest = largest; 
                largest = value; 
            } else if (value > secondLargest && value < largest) {
                secondLargest = value; 
            }
        }

        return secondLargest;
    }
}
