import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ExceptionHandling {
    public static void readNumbersFromFile(String filename) throws FileNotFoundException, PositiveNumberException {
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num > 0) {
                scanner.close();
                throw new PositiveNumberException("Positive number found: " + num);
            }
        }
        scanner.close();
    }

    public static void readNumbersFromUser() throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.print("Enter the numbers: ");
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (!numbers.add(num)) {
                scanner.close();
                throw new DuplicateNumberException("Duplicate number found: " + num);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            readNumbersFromFile("E://SY/SEM - 2/OOP/My3/numbers");
            System.out.println("No positive numbers found in the file.");
            readNumbersFromUser();
            System.out.println("No duplicate numbers found from user input.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (DuplicateNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
//23
