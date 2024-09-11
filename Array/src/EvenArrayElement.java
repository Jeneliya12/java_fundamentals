public class EvenArrayElement {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.out.println("Elements present on even positions:");
        
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }
}
