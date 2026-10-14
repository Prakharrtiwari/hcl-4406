// ===================================================================
// 3. SEALED CLASSES (Java 17+ Feature) - [Shield / Protection Concept]
// ===================================================================
// Concept:
// Pehle: Ya toh class open hoti thi (koi bhi inherit kar sakta tha) ya final (koi inherit nahi kar sakta tha).
// Sealed Class: Yeh ek "Shield" ki tarah protection deti hai jisme Parent class
// khud decide karti hai ki kaun-kaun si Child classes usko inherit kar sakti hain.
//
// Rules:
// 1. Parent class me 'sealed' aur 'permits' keyword use hota hai.
// 2. Permitted child class ko in 3 me se ek hona ZARURI hai:
//    - 'final'      -> Aage iska koi child nahi ban sakta.
//    - 'sealed'     -> Yeh aage aur restrict karegi.
//    - 'non-sealed' -> Isko aage koi bhi normal class extend kar sakti hai (open).

// 1. Parent Sealed Class (Sirf Car aur Bike ko permit kar rahi hai)
sealed class Vehicle permits Car, Bike {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle start ho raha hai.");
    }
}

// 2. Child 1: 'final' class (Car ko aage koi aur extend nahi kar sakta)
final class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void showDoors() {
        System.out.println("Car me " + doors + " doors hain.");
    }
}

// 3. Child 2: 'non-sealed' class (Bike ko aage koi bhi extend kar sakta hai)
non-sealed class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, boolean hasGear) {
        super(brand);
        this.hasGear = hasGear;
    }

    public void showBikeType() {
        System.out.println("Bike geared hai? " + hasGear);
    }
}

// Note: Agar hum 'class Truck extends Vehicle' likhenge toh Java ERROR dega,
// kyunki Vehicle ne Truck ko permit nahi kiya hai!

public class SealedClassDemo {
    public static void main(String[] args) {
        System.out.println("===== SEALED (SHIELD) CLASSES DEMO =====\n");

        // Car object
        Car myCar = new Car("Tata Nexon", 4);
        myCar.start();
        myCar.showDoors();

        System.out.println();

        // Bike object
        Bike myBike = new Bike("Royal Enfield", true);
        myBike.start();
        myBike.showBikeType();

        System.out.println("\n[Note]: Koi un-permitted class (jaise Truck) Vehicle ko extend nahi kar sakti!");
    }
}
