// ==========================================
// 1. RECORD DEMO (Java 16+ Feature)
// ==========================================
// Record ek special class hoti hai jo sirf "Data Store" karne ke kaam aati hai.
// Pehle hume private fields, constructor, getters, toString, equals, hashCode likhna padta tha.
// Record me yeh sab Java AUTOMATICALLY bana deta hai!

// Record banaya: sirf 1 line me!
record Student(int id, String name, double marks) {
    // Note: 
    // 1. Iske fields by default 'private final' hote hain (immutable/change nahi hote).
    // 2. Getters ka naam field ke naam par hota hai: id(), name(), marks() (getId() nahi hota).
    // 3. Compact Constructor (Optional - agar validation lagana ho):
    public Student {
        if (marks < 0) {
            throw new IllegalArgumentException("Marks negative nahi ho sakte!");
        }
    }

    // Custom method bhi add kar sakte hain:
    public void printDetails() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        System.out.println("----- Java Record Demo -----\n");

        // 1. Object banana (Jaise normal class ka banta hai)
        Student s1 = new Student(101, "Prakhar", 92.5);
        Student s2 = new Student(102, "Rahul", 85.0);
        Student s3 = new Student(101, "Prakhar", 92.5);

        // 2. Data access karna (field() method se)
        System.out.println("Roll No : " + s1.id());
        System.out.println("Name    : " + s1.name());
        System.out.println("Marks   : " + s1.marks());

        // 3. Automatic toString() method
        System.out.println("\nAutomatic toString() output:");
        System.out.println(s1); // Direct print karne par sundar output aata hai

        // 4. Automatic equals() and hashCode()
        System.out.println("\nChecking equality:");
        System.out.println("s1 equals s2? " + s1.equals(s2)); // false
        System.out.println("s1 equals s3? " + s1.equals(s3)); // true (data same hai)

        // 5. Custom method call karna
        System.out.println("\nCalling Custom Method:");
        s1.printDetails();
    }
}
