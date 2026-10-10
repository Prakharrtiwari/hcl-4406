// Day 1: Basic Class and Object Example
// Demonstrates defining a class, instance variables, constructor, and creating objects

class Student {
    // Instance variables (fields)
    int id;
    String name;

    // Default constructor
    Student() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

public class BasicClassAndObject {
    public static void main(String[] args) {
        System.out.println("--- Creating Objects in Java ---");

        // Object using default constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Object using parameterized constructor
        Student student2 = new Student(101, "Alice");
        student2.displayDetails();

        Student student3 = new Student(102, "Bob");
        student3.displayDetails();
    }
}
