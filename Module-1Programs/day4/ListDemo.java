import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Prakhar");
        arrayList.add("Aman");
        arrayList.add("Prakhar");
        arrayList.set(1, "Sachin");
        arrayList.remove(0);
        System.out.println("ArrayList: " + arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.addFirst("C++");
        linkedList.addLast("Python");
        System.out.println("LinkedList: " + linkedList);

        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        System.out.println("Vector: " + vector);

        Stack<String> stack = new Stack<>();
        stack.push("Item 1");
        stack.push("Item 2");
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
    }
}
