// Day 1: Control Flow Statements
// Demonstrates conditionals (if-else, switch) and loops (for, while, do-while)

public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("--- 1. Conditional Statements (if-else) ---");
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        System.out.println("\n--- 2. Switch Case ---");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }

        System.out.println("\n--- 3. For Loop ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For iteration: " + i);
        }

        System.out.println("\n--- 4. While Loop ---");
        int count = 1;
        while (count <= 3) {
            System.out.println("While iteration: " + count);
            count++;
        }

        System.out.println("\n--- 5. Do-While Loop ---");
        int num = 1;
        do {
            System.out.println("Do-While iteration (executes at least once): " + num);
            num++;
        } while (num <= 2);
    }
}
