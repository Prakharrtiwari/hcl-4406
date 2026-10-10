import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.addFirst("C++");
        list.addLast("JavaScript");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("List: " + list);
    }
}
