// Day 2: Hierarchical Inheritance
// Concept: Multiple child classes inherit from a single common parent class.
// Hierarchy:
//            Shape
//           /     \
//      Circle     Rectangle

// Common Parent Class
class Shape {
    String color = "Blue";

    void render() {
        System.out.println("Rendering shape on screen with color: " + color);
    }
}

// Child Class 1
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle Area (radius = %.1f): %.2f%n", radius, area);
    }
}

// Child Class 2
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.printf("Rectangle Area (%.1f x %.1f): %.2f%n", length, width, area);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("--- Hierarchical Inheritance Demo ---");

        System.out.println("\n[Circle Object]");
        Circle circle = new Circle(5.0);
        circle.render();          // Inherited from Shape
        circle.calculateArea();   // Defined in Circle

        System.out.println("\n[Rectangle Object]");
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.render();       // Inherited from Shape
        rectangle.calculateArea();// Defined in Rectangle
    }
}
