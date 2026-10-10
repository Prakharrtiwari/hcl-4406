// Day 2: Method Types in Java
// Demonstrates:
// 1. Instance (Non-static) Methods
// 2. Static Methods
// 3. Methods with Parameters & Return Values
// 4. Method Overloading (Compile-time Polymorphism)

class Calculator {
    // 1. Static Method: Can be called without creating an object of the class
    public static void printWelcome() {
        System.out.println("Welcome to the Calculator Demo (Called via static method)!");
    }

    // 2. Instance (Non-static) Method without return value (void)
    public void greetUser(String userName) {
        System.out.println("Hello, " + userName + "! Welcome to Java methods.");
    }

    // 3. Instance Method with parameters and a return value
    public int multiply(int a, int b) {
        return a * b;
    }

    // 4. Method Overloading: Same method name 'add', but different parameter list
    // Overload 1: Two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overload 2: Three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overload 3: Two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodTypesDemo {
    public static void main(String[] args) {
        System.out.println("--- 1. Calling Static Method (ClassName.methodName) ---");
        Calculator.printWelcome();

        System.out.println("\n--- 2. Calling Instance Methods (requires object) ---");
        Calculator calc = new Calculator();
        calc.greetUser("Alex");

        int product = calc.multiply(6, 7);
        System.out.println("Multiplication Result: " + product);

        System.out.println("\n--- 3. Method Overloading Examples ---");
        System.out.println("Adding two ints (10 + 20): " + calc.add(10, 20));
        System.out.println("Adding three ints (10 + 20 + 30): " + calc.add(10, 20, 30));
        System.out.println("Adding two doubles (5.5 + 4.2): " + calc.add(5.5, 4.2));
    }
}
