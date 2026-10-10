// Day 2: Method Overriding (Runtime Polymorphism)
// Concept: A subclass provides its own specific implementation of a method
// already defined in its superclass using the same name, return type, and parameters.

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting with a generic ignition sound...");
    }

    void speedLimit() {
        System.out.println("Default speed limit is 60 km/h.");
    }
}

class SportsCar extends Vehicle {
    // Overriding the start method of the parent class
    @Override
    void start() {
        // Calling parent method using 'super'
        super.start();
        System.out.println("SportsCar: Turbocharged V8 engine roars to life!");
    }

    // Overriding speedLimit
    @Override
    void speedLimit() {
        System.out.println("SportsCar speed limit is 250 km/h.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("--- Method Overriding Demo ---");

        // Reference of parent type pointing to child object (Dynamic Method Dispatch)
        Vehicle myVehicle = new SportsCar();

        // Calls the overridden versions at runtime
        myVehicle.start();
        myVehicle.speedLimit();
    }
}
