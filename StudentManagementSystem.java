import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(int rollNumber) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student with roll number " + rollNumber + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void replaceGrade(int rollNumber, String newGrade) {
        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                student.setGrade(newGrade);
                System.out.println("Grade of student with roll number " + rollNumber + " replaced successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Replace Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    Student newStudent = new Student(name, rollNumber, grade);
                    studentManager.addStudent(newStudent);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    studentManager.removeStudent(rollToRemove);
                    break;
                case 3:
                    studentManager.displayStudents();
                    break;
                case 4:
                    System.out.print("Enter roll number of student to replace grade: ");
                    int rollToReplace = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new grade: ");
                    String newGrade = scanner.nextLine();
                    studentManager.replaceGrade(rollToReplace, newGrade);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
//19
