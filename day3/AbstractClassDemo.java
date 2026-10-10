// Day 3: Abstraction using Abstract Classes
// Concept:
// - An abstract class cannot be instantiated directly with 'new'.
// - It can contain both abstract methods (without body) and concrete methods (with body).
// - Subclasses must provide implementation for all abstract methods.

abstract class BankAccount {
    String accountHolder;
    double balance;

    // Constructor in abstract class
    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Abstract method: Every account type calculates interest differently
    abstract double calculateInterest();

    // Concrete method: Common functionality shared across all accounts
    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited: $" + amount + " | New Balance: $" + balance);
    }

    void displayBalance() {
        System.out.println(accountHolder + "'s Current Balance: $" + balance);
    }
}

// Concrete subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate = 0.05; // 5%

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

// Concrete subclass 2: CurrentAccount
class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    double calculateInterest() {
        return 0.0; // Current accounts typically earn no interest
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("--- Abstract Class Demo ---");

        // Cannot do: BankAccount acc = new BankAccount(...) -> Compile Error

        BankAccount savings = new SavingsAccount("Alice", 1000.0);
        savings.deposit(500.0);
        System.out.println("Savings Interest: $" + savings.calculateInterest());

        System.out.println();

        BankAccount current = new CurrentAccount("Tech Corp", 5000.0);
        current.deposit(1000.0);
        System.out.println("Current Account Interest: $" + current.calculateInterest());
    }
}
