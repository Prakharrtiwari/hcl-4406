// Parent Class
class Animal {
    String color = "White";

    // Parent Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }
}

// Child Class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        // 1. Using 'super' to call Parent's constructor
        // (Note: Java adds super() automatically if you don't write it)
        super(); 

        // 2. Using 'this' to refer to current class variable vs parent variable
        System.out.println("Child color (this): " + this.color); // Output: Black
        System.out.println("Parent color (super): " + super.color); // Output: White
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}