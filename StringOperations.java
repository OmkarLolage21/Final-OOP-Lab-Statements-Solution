import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        System.out.println("\nSorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println("\nEnter two strings to combine:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String combinedString = str1.concat(str2);
        System.out.println("Combined string: " + combinedString);

        System.out.println("\nEnter a string to reverse:");
        String reverseString = scanner.nextLine();
        String reversed = reverse(reverseString);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
//8
