class Employees {
    private String name;
    private String employeeId;
    private double hourlyRate;

    public Employees(String name, String employeeId, double hourlyRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}

class FullTimeEmployee extends Employees {
    private double salary;
    private String benefits;

    public FullTimeEmployee(String name, String employeeId, double hourlyRate, double salary, String benefits) {
        super(name, employeeId, hourlyRate);
        this.salary = salary;
        this.benefits = benefits;
    }

    public double getMonthlySalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employees {
    private int hoursWorked;
    private double overtimeRate;

    public PartTimeEmployee(String name, String employeeId, double hourlyRate, int hoursWorked, double overtimeRate) {
        super(name, employeeId, hourlyRate);
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
    }

    public double getMonthlySalary() {
        double regularPay = getHourlyRate() * hoursWorked;
        double overtimePay = (hoursWorked > 40) ? (hoursWorked - 40) * overtimeRate : 0;
        return regularPay + overtimePay;
    }
}

public class CompanyEmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", "FT001", 30.0, 5000.0, "Health Insurance");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", "PT001", 20.0, 45, 25.0);

        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + fullTimeEmployee.getName());
        System.out.println("Employee ID: " + fullTimeEmployee.getEmployeeId());
        System.out.println("Monthly Salary: $" + fullTimeEmployee.getMonthlySalary());

        System.out.println("\nPart-Time Employee Details:");
        System.out.println("Name: " + partTimeEmployee.getName());
        System.out.println("Employee ID: " + partTimeEmployee.getEmployeeId());
        System.out.println("Monthly Salary: $" + partTimeEmployee.getMonthlySalary());
    }
}
//21
