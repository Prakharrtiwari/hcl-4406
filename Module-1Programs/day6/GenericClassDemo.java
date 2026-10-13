

// T ka matlab hota hai 'Type'. 
// Yeh ek placeholder hai, jab hum object banayenge tab batayenge ki T kya hoga (Integer, String, etc.)
class Box<T> {
    private T item; // T type ka koi bhi item

    // Constructor: Box me item rakhne ke liye
    public Box(T item) {
        this.item = item;
    }

    // Item set karne ke liye
    public void setItem(T item) {
        this.item = item;
    }

    // Item bahar nikalne ke liye
    public T getItem() {
        return item;
    }

    // Item dikhane ke liye
    public void showItem() {
        System.out.println("Box ke andar hai: " + item + " (Type: " + item.getClass().getSimpleName() + ")");
    }
}

// 2 Types ka Generic Class (Key-Value pair jaise)
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display() {
        System.out.println("Key: " + key + " | Value: " + value);
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        System.out.println("--- Generic Class (Single Type Parameter T) ---");

        // 1. String wala box
        Box<String> toyBox = new Box<>("Teddy Bear");
        toyBox.showItem();

        // 2. Integer (Number) wala box
        Box<Integer> numberBox = new Box<>(100);
        numberBox.showItem();

        // 3. Double wala box
        Box<Double> priceBox = new Box<>(99.99);
        priceBox.showItem();

        System.out.println("\n--- Generic Class (Multiple Types: K, V) ---");
        // Roll number (Integer) aur Name (String) ka pair
        Pair<Integer, String> student = new Pair<>(101, "Rahul");
        student.display();

        // Name (String) aur Marks (Double) ka pair
        Pair<String, Double> marks = new Pair<>("Maths", 95.5);
        marks.display();
    }
}
