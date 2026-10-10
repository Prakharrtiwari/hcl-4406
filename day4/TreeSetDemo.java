import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(50);
        scores.add(10);
        scores.add(40);
        scores.add(20);
        scores.add(10);

        System.out.println("First element: " + scores.first());
        System.out.println("Last element: " + scores.last());

        scores.remove(40);

        System.out.println("TreeSet: " + scores);
    }
}
