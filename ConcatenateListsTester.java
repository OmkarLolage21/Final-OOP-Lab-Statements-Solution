import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConcatenateListsTester {

    public static void main(String[] args) {
        List<Object> listOne = new ArrayList<>(Arrays.asList("Hello", 102, 200.8, 25));
        List<Object> listTwo = new ArrayList<>(Arrays.asList(150, 40.8, "welcome", 'A'));

        List<Object> concatenatedList = concatenateLists(listOne, listTwo);
        System.out.println("Concatenated List: " + concatenatedList);
    }

    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {
        List<Object> reversedListTwo = new ArrayList<>(listTwo);
        Collections.reverse(reversedListTwo);
        List<Object> concatenatedList = new ArrayList<>(listOne);
        concatenatedList.addAll(reversedListTwo);
        return concatenatedList;
    }
}

//2