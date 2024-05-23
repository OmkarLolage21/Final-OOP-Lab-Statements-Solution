import java.util.Scanner;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    private int balance;

    public BankA(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    private int balance;

    public BankB(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    private int balance;

    public BankC(int balance) {
        this.balance = balance;
    }

    @Override
    int getBalance() {
        return balance;
    }
}

public class BankBalanceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance for Bank A: $");
        int balanceA = scanner.nextInt();
        BankA bankA = new BankA(balanceA);

        System.out.print("Enter balance for Bank B: $");
        int balanceB = scanner.nextInt();
        BankB bankB = new BankB(balanceB);

        System.out.print("Enter balance for Bank C: $");
        int balanceC = scanner.nextInt();
        BankC bankC = new BankC(balanceC);

        System.out.println("\nBalance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());

        scanner.close();
    }
}

//13