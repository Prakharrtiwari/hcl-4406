// Day 1: Data Types and Variables Example
// Demonstrates primitive data types, variable declarations, and type casting

public class DataTypesAndVariables {
    public static void main(String[] args) {
        // Integer types
        byte byteVal = 100;                 // 1 byte: -128 to 127
        short shortVal = 5000;              // 2 bytes: -32,768 to 32,767
        int intVal = 250000;                // 4 bytes: standard integer
        long longVal = 15000000000L;        // 8 bytes: suffix 'L' for long literal

        // Floating-point types
        float floatVal = 5.75f;             // 4 bytes: suffix 'f' for float literal
        double doubleVal = 19.99;           // 8 bytes: standard decimal number

        // Character and Boolean types
        char grade = 'A';                   // 2 bytes: single quotes for single character
        boolean isJavaFun = true;           // 1 bit: true or false

        // Printing values
        System.out.println("--- Primitive Data Types in Java ---");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);

        // Type Casting Examples
        System.out.println("\n--- Type Casting ---");
        // 1. Widening Casting (Implicit / Automatic): small -> large type
        int num = 50;
        double convertedDouble = num;
        System.out.println("Implicit Casting (int to double): " + convertedDouble);

        // 2. Narrowing Casting (Explicit / Manual): large -> small type
        double pi = 3.14159;
        int convertedInt = (int) pi;
        System.out.println("Explicit Casting (double to int): " + convertedInt);
    }
}
