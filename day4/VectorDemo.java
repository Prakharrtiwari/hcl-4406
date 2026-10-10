import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());

        numbers.remove(1);

        System.out.println("Vector: " + numbers);
    }
}
