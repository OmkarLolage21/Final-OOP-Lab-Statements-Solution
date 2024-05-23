import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class UniqueArrayListTester {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 10, 15, 40, 15, 40));
        System.out.println("Original List: " + numbers);
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}
//1
