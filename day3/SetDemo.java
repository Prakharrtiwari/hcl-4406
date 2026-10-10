// Day 3: Java Collections - Set Interface
// Set Characteristics:
// - Does NOT allow duplicate elements
// - Models mathematical set abstraction
// Implementations:
// 1. HashSet: Backed by hash table. No order guaranteed. Fastest (O(1)).
// 2. LinkedHashSet: Maintains insertion order.
// 3. TreeSet: Elements sorted in natural ascending order (or custom Comparator).

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("            SET INTERFACE EXAMPLES        ");
        System.out.println("==========================================");

        // 1. HashSet: Unordered, does not permit duplicate values
        System.out.println("\n--- 1. HashSet (Unordered, Unique elements) ---");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Elephant");
        hashSet.add("Dog"); // Duplicate - will be ignored
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Cat'? " + hashSet.contains("Cat"));

        // 2. LinkedHashSet: Preserves the insertion order
        System.out.println("\n--- 2. LinkedHashSet (Maintains insertion order) ---");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        linkedHashSet.add("Green"); // Duplicate ignored
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 3. TreeSet: Automatically sorted in ascending/natural order
        System.out.println("\n--- 3. TreeSet (Sorted Order) ---");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(89);
        treeSet.add(23);
        treeSet.add(12); // Duplicate ignored
        System.out.println("TreeSet (Ascending sorted): " + treeSet);
    }
}
