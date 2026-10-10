// Day 2: Single Inheritance
// Concept: One derived (child) class inherits properties and methods from one base (parent) class.

// Parent Class
class Employee {
    String company = "HCLTech";
    double baseSalary = 50000;

    void displayEmployeeInfo() {
        System.out.println("Company: " + company);
        System.out.println("Base Salary: $" + baseSalary);
    }
}

// Child Class extending Employee
class Developer extends Employee {
    String programmingLanguage = "Java";
    double bonus = 15000;

    void displayDeveloperInfo() {
        // Accessing inherited fields from parent class
        System.out.println("Developer Skill: " + programmingLanguage);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Compensation: $" + (baseSalary + bonus));
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance Demo ---");
        Developer dev = new Developer();

        // Calling method inherited from parent
        dev.displayEmployeeInfo();

        // Calling child class method
        dev.displayDeveloperInfo();
    }
}
