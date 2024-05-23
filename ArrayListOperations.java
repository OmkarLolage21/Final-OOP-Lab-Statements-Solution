import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("How");
        list1.add("Are");
        list1.add("You");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("How");
        list2.add("Are");
        list2.add("You");

        list1.addAll(1, list2);

        System.out.println(list1);

        int index = list1.indexOf("How");
        System.out.println("Index of mentioned word: " + index);

        list1.remove(3);

        list2.set(3, "U");

        System.out.println("List1 after removing the 4th element: " + list1);
        System.out.println("List2 after replacing the 4th element: " + list2);
    }
}
//12