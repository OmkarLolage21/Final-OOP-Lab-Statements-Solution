public class Calculator {
    private static final double PI = 3.14;

    static {
        System.out.println("Welcome to Simple Calculator");
    }

    {
        System.out.println("New calculator instance");
    }

    public Calculator() {
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition result: " + calculator.add(5, 3));
        System.out.println("Subtraction result: " + calculator.subtract(5, 3));
        System.out.println("Multiplication result: " + calculator.multiply(5, 3));
        System.out.println("Division result: " + calculator.divide(5, 3));
        System.out.println("Value of PI: " + PI);
    }
}
//22
