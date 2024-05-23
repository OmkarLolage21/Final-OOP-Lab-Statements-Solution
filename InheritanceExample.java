import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String designation;
    double salary;

    public Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            employees[i] = new Employee(name, age, designation, salary);
        }

        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println(employee.name);
            }
        }
    }
}

//5