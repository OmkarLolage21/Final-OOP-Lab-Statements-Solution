import java.util.Scanner;

class PostGraduateStudent {
    private int studentId;
    private double aggregateMarks;
    private static final double BASE_STIPEND = 1000;

    public PostGraduateStudent(int studentId, double aggregateMarks) {
        this.studentId = studentId;
        this.aggregateMarks = aggregateMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public double calculateTotalStipend() {
        double bonusStipend = 0;
        if (aggregateMarks >= 85 && aggregateMarks < 90) {
            bonusStipend = 10;
        } else if (aggregateMarks >= 90 && aggregateMarks < 95) {
            bonusStipend = 15;
        } else if (aggregateMarks >= 95 && aggregateMarks < 100) {
            bonusStipend = 20;
        }
        return BASE_STIPEND + bonusStipend;
    }
}

public class StipendCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter aggregate marks: ");
        double aggregateMarks = scanner.nextDouble();

        PostGraduateStudent student = new PostGraduateStudent(studentId, aggregateMarks);
        double totalStipend = student.calculateTotalStipend();

        System.out.println("The final stipend of " + student.getStudentId() + " is ₹" + totalStipend);
    }
}
//6