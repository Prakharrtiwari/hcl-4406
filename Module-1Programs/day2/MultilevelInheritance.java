// Day 2: Multilevel Inheritance
// Concept: A child class inherits from a parent class, which in turn inherits from another class.
// Hierarchy: Device -> Computer -> Laptop

// Grandparent Class
class Device {
    void powerOn() {
        System.out.println("Device: Powering on...");
    }
}

// Parent Class
class Computer extends Device {
    void processData() {
        System.out.println("Computer: Processing data using CPU...");
    }
}

// Child Class
class Laptop extends Computer {
    void chargeBattery() {
        System.out.println("Laptop: Charging battery via USB-C...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance Demo ---");
        Laptop myLaptop = new Laptop();

        // Calling method from Grandparent class
        myLaptop.powerOn();

        // Calling method from Parent class
        myLaptop.processData();

        // Calling method from Child class
        myLaptop.chargeBattery();
    }
}
