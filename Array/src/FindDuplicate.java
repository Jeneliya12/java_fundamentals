import java.util.HashSet;
import java.util.Set;

public class FindDuplicate{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};
        
        Set<Integer> duplicates = findDuplicates(array);
        
        System.out.println("Duplicate values: " + duplicates);
    }

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        return duplicates;
    }
}
