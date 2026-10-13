package exception;

public class ThrowsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
