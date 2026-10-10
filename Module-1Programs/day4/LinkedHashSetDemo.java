import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");

        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        fruits.remove("Orange");

        System.out.println("Size: " + fruits.size());
        System.out.println("LinkedHashSet: " + fruits);
    }
}
