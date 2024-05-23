import java.io.File;
import java.util.Scanner;

public class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File exists: Yes");
            System.out.println("File is readable: " + (file.canRead() ? "Yes" : "No"));
            System.out.println("File is writable: " + (file.canWrite() ? "Yes" : "No"));
            System.out.println("File type: " + (file.isDirectory() ? "Directory" : "File"));
            System.out.println("File length (bytes): " + file.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
//24
