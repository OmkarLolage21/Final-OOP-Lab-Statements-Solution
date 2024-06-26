import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public A(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3.0;
    }
}

class B extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;

    public B(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / 4.0;
    }
}

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Student A (3 subjects):");
        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();
        A studentA = new A(marks1, marks2, marks3);

        System.out.println("Enter marks for Student B (4 subjects):");
        marks1 = scanner.nextInt();
        marks2 = scanner.nextInt();
        marks3 = scanner.nextInt();
        int marks4 = scanner.nextInt();
        B studentB = new B(marks1, marks2, marks3, marks4);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
    }
}
//16