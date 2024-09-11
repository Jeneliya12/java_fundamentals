import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"banana", "date", "fig", "grape"};
        
        Set<String> commonElements = findCommonElements(array1, array2);
        
        System.out.println("Common elements: " + commonElements);
    }

    public static Set<String> findCommonElements(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> common = new HashSet<>();
    
        for (String str : array1) {
            set1.add(str);
        }

        for (String str : array2) {
            set2.add(str);
        }
        
        for (String str : set1) {
            if (set2.contains(str)) {
                common.add(str);
            }
        }
        
        return common;
    }
}
