

public class GenericMethodDemo {

    // 1. Ek simple Generic Function jo kisi bhi type ka single data print karega
    // <T> likhne ka matlab: "Ye method generic hai aur T type ka data accept karega"
    public static <T> void printData(T data) {
        System.out.println("Data: " + data + " | Type: " + data.getClass().getSimpleName());
    }

    // 2. Ek Generic Function jo kisi bhi type ke Array ko print karega
    public static <T> void printArray(T[] arr) {
        System.out.print("[ ");
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println("]");
    }

    // 3. Ek Generic Function jo do alag-alag types <T, U> accept karta hai
    public static <T, U> void showPair(T item1, U item2) {
        System.out.println("Item 1: " + item1 + ", Item 2: " + item2);
    }

    // 4. Return type wala Generic Function (First element return karta hai)
    public static <T> T getFirst(T[] arr) {
        if (arr.length > 0) {
            return arr[0];
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("--- 1. Single Value Generic Function ---");
        printData("Namaste World");  // String
        printData(12345);            // Integer
        printData(45.67);            // Double
        printData(true);             // Boolean

        System.out.println("\n--- 2. Generic Array Function ---");
        // Dhyaan de: Generics me primitive (int, char) ki jagah Wrapper Class (Integer, Character) use hota hai
        Integer[] numList = {10, 20, 30, 40};
        String[] nameList = {"Amit", "Pooja", "Rohan"};
        Character[] charList = {'A', 'B', 'C'};

        System.out.print("Numbers: ");
        printArray(numList);

        System.out.print("Names: ");
        printArray(nameList);

        System.out.print("Characters: ");
        printArray(charList);

        System.out.println("\n--- 3. Two Different Types in Function ---");
        showPair("RollNo", 101);
        showPair("Temperature", 36.6);
        showPair(1, "First Rank");

        System.out.println("\n--- 4. Generic Function with Return Value ---");
        String firstFriend = getFirst(nameList);
        Integer firstNumber = getFirst(numList);
        System.out.println("Pehla dost: " + firstFriend);
        System.out.println("Pehla number: " + firstNumber);
    }
}
