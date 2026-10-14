// ===============================================================
// 2. SWITCH STATEMENT VS SWITCH EXPRESSION (Java 14+ Feature)
// ===============================================================
// Switch Statement (Purana Tarika):
//  - ':' use karta hai.
//  - 'break' lagana compulsory hota hai warna fall-through ho jata hai.
//  - Value direct return nahi kar sakta.

// Switch Expression (Naya Modern Tarika):
//  - '->' (arrow) use karta hai.
//  - 'break' ki zarurat nahi hoti (no fall-through).
//  - Directly variable me value return kar sakta hai.
//  - Multiple labels ek sath de sakte hain: case 1, 2, 3 ->
//  - Multi-line code ke liye 'yield' use hota hai.

public class SwitchDemo {

    // 1. OLD WAY: Traditional Switch Statement
    public static void oldSwitchStatement(int day) {
        System.out.println("--- 1. Traditional Switch Statement (Old) ---");
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break; // break bhool gaye toh aage ka bhi execute ho jayega!
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 6:
            case 7:
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }

        System.out.println("Day " + day + " is: " + dayName);
    }

    // 2. NEW WAY: Modern Switch Expression (Arrow syntax + Returns Value)
    public static void newSwitchExpression(int day) {
        System.out.println("\n--- 2. Modern Switch Expression (New) ---");

        // Direct switch se value assign ho rahi hai variable me!
        String dayName = switch (day) {
            case 1 -> "Monday";      // No break needed!
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";  // Ek sath multiple cases
            default -> "Invalid Day";
        };

        System.out.println("Day " + day + " is: " + dayName);
    }

    // 3. YIELD Keyword in Switch Expression (Multi-line logic ke liye)
    public static void switchWithYield(String fruit) {
        System.out.println("\n--- 3. Switch Expression with 'yield' ---");

        int price = switch (fruit.toLowerCase()) {
            case "apple" -> 100;
            case "banana" -> 40;
            case "mango" -> {
                System.out.println("(Special Season Discount Applied on Mango!)");
                int basePrice = 80;
                int discount = 10;
                yield basePrice - discount; // value return karne ke liye 'yield'
            }
            default -> {
                System.out.println("(Item not listed)");
                yield 0;
            }
        };

        System.out.println("Price of " + fruit + ": Rs " + price);
    }

    public static void main(String[] args) {
        System.out.println("===== SWITCH COMPARISON DEMO =====\n");

        // Old vs New testing
        oldSwitchStatement(1);
        newSwitchExpression(1);

        // Multiple case test
        newSwitchExpression(6);

        // Yield example test
        switchWithYield("mango");
        switchWithYield("apple");
    }
}
