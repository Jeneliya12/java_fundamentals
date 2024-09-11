import java.util.HashSet;
import java.util.Set;

public class FindStringDuplicates {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "apple", "date", "banana", "fig"};
        
        Set<String> duplicates = findDuplicates(array);
        
        System.out.println("Duplicate values: " + duplicates);
    }

    public static Set<String> findDuplicates(String[] array) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String str : array) {
            if (seen.contains(str)) {
                duplicates.add(str);
            } else {
                seen.add(str);
            }
        }

        return duplicates;
    }
}
