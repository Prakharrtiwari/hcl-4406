import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Contains 20: " + numbers.contains(20));

        numbers.remove(10);

        System.out.println("Is empty: " + numbers.isEmpty());
        System.out.println("Size: " + numbers.size());
        System.out.println("Set: " + numbers);
    }
}
