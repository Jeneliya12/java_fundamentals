public class ThirdLargestNumber {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) { 
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != secondLargest && num != firstLargest) {
                thirdLargest = num;
            }
        }

        if (thirdLargest != Integer.MIN_VALUE) {
            System.out.println("The third largest number is: " + thirdLargest);
        } else {
            System.out.println("The array does not contain enough unique elements to determine the third largest number.");
        }
    }
}
