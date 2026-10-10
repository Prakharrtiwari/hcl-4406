// Day 3: Java Collections - Map Interface
// Map Characteristics:
// - Stores data in Key-Value pairs (K, V)
// - Keys MUST be UNIQUE; Values can be DUPLICATE
// - Not part of java.util.Collection interface, but part of Java Collections Framework
// Implementations:
// 1. HashMap: Unordered, fast key-lookup (O(1)), allows one null key.
// 2. LinkedHashMap: Preserves insertion order of entries.
// 3. TreeMap: Sorts entries based on the natural order of keys (or custom Comparator).

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("            MAP INTERFACE EXAMPLES        ");
        System.out.println("==========================================");

        // 1. HashMap: Fast lookup, no guaranteed key order
        System.out.println("\n--- 1. HashMap (Key-Value, Unordered) ---");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");
        hashMap.put(103, "Charlie");
        hashMap.put(102, "David"); // Duplicate key overwrites previous value ("Bob" -> "David")

        System.out.println("HashMap entries: " + hashMap);
        System.out.println("Value for key 103: " + hashMap.get(103));
        System.out.println("ContainsKey 101? " + hashMap.containsKey(101));

        // Iterating over Map entries
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("  ID: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 2. LinkedHashMap: Maintains insertion order of keys
        System.out.println("\n--- 2. LinkedHashMap (Preserves Insertion Order) ---");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Math", 90);
        linkedHashMap.put("Science", 85);
        linkedHashMap.put("English", 92);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 3. TreeMap: Automatically sorted by keys in ascending order
        System.out.println("\n--- 3. TreeMap (Sorted by Key) ---");
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("IN", "India");
        treeMap.put("US", "United States");
        treeMap.put("DE", "Germany");
        treeMap.put("AU", "Australia");
        System.out.println("TreeMap (Alphabetical key order): " + treeMap);
    }
}
