// Day 3: Java Collections - List Interface
// List Characteristics:
// - Ordered collection (maintains insertion order)
// - Allows duplicate elements
// - Positional access (index-based: 0, 1, 2...)
// Implementations: ArrayList, LinkedList, Vector, Stack

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("           LIST INTERFACE EXAMPLES        ");
        System.out.println("==========================================");

        // 1. ArrayList: Resizable array. Fast for searching/access (O(1)), slower for insertions in the middle.
        System.out.println("\n--- 1. ArrayList ---");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Apple"); // Duplicates allowed
        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.remove("Orange");
        System.out.println("After removing 'Orange': " + arrayList);

        // 2. LinkedList: Doubly linked list. Fast for insertion and deletion (O(1)), slower for random access.
        System.out.println("\n--- 2. LinkedList ---");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.addFirst("C++");       // LinkedList specific method
        linkedList.addLast("JavaScript"); // LinkedList specific method
        System.out.println("LinkedList elements: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // 3. Vector: Synchronized (Thread-safe) dynamic array (legacy collection).
        System.out.println("\n--- 3. Vector ---");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector elements: " + vector);
        System.out.println("Vector capacity: " + vector.capacity());

        // 4. Stack: LIFO (Last-In, First-Out) data structure extending Vector.
        System.out.println("\n--- 4. Stack (LIFO) ---");
        Stack<String> stack = new Stack<>();
        stack.push("Book 1");
        stack.push("Book 2");
        stack.push("Book 3");
        System.out.println("Stack elements: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
