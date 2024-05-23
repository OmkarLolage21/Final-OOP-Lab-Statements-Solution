import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.print("Iterator Loop: ");
        iterateWithIterator(numbers);

        System.out.print("Advanced For Loop: ");
        iterateWithEnhancedForLoop(numbers);

        System.out.print("For Loop: ");
        iterateWithForLoop(numbers);
    }

    public static void iterateWithIterator(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void iterateWithEnhancedForLoop(List<Integer> list) {
        for (Integer number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void iterateWithForLoop(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

//4