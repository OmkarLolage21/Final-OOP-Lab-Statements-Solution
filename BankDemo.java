class Customers {
    private String name;
    private String address;

    public Customers(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Accounts {
    private int accountNumber;
    private double balance;

    public Accounts(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class RBI {
    private Customers customer;
    private Accounts account;

    public RBI(Customers customer, Accounts account) {
        this.customer = customer;
        this.account = account;
    }

    public double getInterestRate() {
        return 4.0; // Default interest rate set by RBI
    }

    public double getWithdrawalLimit() {
        return 50000.0; // Default withdrawal limit set by RBI
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }
}

class SBI extends RBI {
    public SBI(Customers customer, Accounts account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 5.0; // Interest rate set by SBI
    }

    @Override
    public double getWithdrawalLimit() {
        return 60000.0; // Withdrawal limit set by SBI
    }
}

class ICICI extends RBI {
    public ICICI(Customers customer, Accounts account) {
        super(customer, account);
    }

    @Override
    public double getInterestRate() {
        return 4.5; // Interest rate set by ICICI
    }

    @Override
    public double getWithdrawalLimit() {
        return 55000.0; // Withdrawal limit set by ICICI
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Customers customer1 = new Customers("John Doe", "123 Main Street");
        Accounts account1 = new Accounts(101, 5000.0);

        RBI rbi1 = new SBI(customer1, account1);
        System.out.println("SBI Details:");
        System.out.println("Interest Rate: " + rbi1.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: $" + rbi1.getWithdrawalLimit());
        rbi1.displayDetails();

        System.out.println();

        Customers customer2 = new Customers("Jane Smith", "456 Oak Avenue");
        Accounts account2 = new Accounts(202, 8000.0);

        RBI rbi2 = new ICICI(customer2, account2);
        System.out.println("ICICI Details:");
        System.out.println("Interest Rate: " + rbi2.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: $" + rbi2.getWithdrawalLimit());
        rbi2.displayDetails();
    }
}
//18
