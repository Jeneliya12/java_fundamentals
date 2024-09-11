public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int valueToRemove = 30; 

        int[] newArray = removeElement(array, valueToRemove);

        System.out.print("Array after removal: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeElement(int[] array, int value) {
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Element not found.");
            return array;
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < indexToRemove; i++) {
            newArray[i] = array[i];
        }
        
        for (int i = indexToRemove + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        return newArray;
    }
}
