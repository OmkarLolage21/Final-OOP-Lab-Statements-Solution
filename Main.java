interface Account {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface Persons {
    void store(String name);
    void disp();
}

class Customer implements Account, Persons {
    private String name;
    private int accountNumber;
    private double balance;

    @Override
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Account Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public void store(String name) {
        this.name = name;
    }

    @Override
    public void disp() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
    }

    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest: $" + interest);
        System.out.println("Total Balance after Interest: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John");
        customer.set("John", 123456, 1000);
        customer.display();
        customer.calculateInterest(5);
        customer.disp();
    }
}
//7