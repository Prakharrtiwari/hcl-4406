// Day 3: Abstraction using Interfaces
// Concept:
// - An interface is a blueprint of a class containing abstract methods.
// - All methods in an interface are by default 'public abstract' (until Java 8 introduced default/static).
// - Java supports multiple inheritance through interfaces!

interface Printable {
    void print(); // Abstract method
}

interface Scannable {
    void scan(); // Abstract method
}

// All-in-One Machine implementing multiple interfaces
class AllInOneMachine implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document in high resolution...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning physical document to PDF...");
    }
}

// Interface demonstrating Java 8+ default and static methods
interface PaymentGateway {
    // Abstract method
    void processPayment(double amount);

    // Default method (has implementation, subclasses can override or use as is)
    default void generateReceipt(double amount) {
        System.out.println("Receipt generated for payment: $" + amount);
    }

    // Static method (utility method called via interface name)
    static void printSecurityNotice() {
        System.out.println("[Security Notice]: All transactions are 256-bit SSL encrypted.");
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of: $" + amount);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- 1. Multiple Interface Implementation ---");
        AllInOneMachine printer = new AllInOneMachine();
        printer.print();
        printer.scan();

        System.out.println("\n--- 2. Interface Default & Static Methods ---");
        // Calling static method via interface name
        PaymentGateway.printSecurityNotice();

        PaymentGateway payment = new UPIPayment();
        payment.processPayment(250.0);
        payment.generateReceipt(250.0); // Inherited default method
    }
}
