import java.util.Scanner;

public class EvenSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers in the array: " + sumOfEvenNumbers);

        scanner.close();
    }

    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

//14