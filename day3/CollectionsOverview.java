// Day 3: Java Collections Framework - Comprehensive Overview
// Quick reference summary showing all 4 primary Collection types side-by-side:
// 1. List  : Ordered, allows duplicates, index-accessible
// 2. Set   : No duplicates, mathematical set
// 3. Queue : FIFO / priority processing order
// 4. Map   : Key-Value pairs, unique keys

import java.util.*;

public class CollectionsOverview {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       JAVA COLLECTIONS FRAMEWORK OVERVIEW        ");
        System.out.println("==================================================");

        // 1. LIST: When order and duplicates matter
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Spring", "Java"));
        System.out.println("1. LIST (Allows Duplicates) : " + list);

        // 2. SET: When uniqueness is required
        Set<String> set = new HashSet<>(Arrays.asList("Java", "Spring", "Java"));
        System.out.println("2. SET (Unique Only)        : " + set);

        // 3. QUEUE: When element order/processing order matters
        Queue<String> queue = new PriorityQueue<>(Arrays.asList("Charlie", "Alice", "Bob"));
        System.out.print("3. QUEUE (Priority Poll)    : ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        // 4. MAP: When you need Key-Value lookups
        Map<String, String> map = new LinkedHashMap<>();
        map.put("course", "Java Training");
        map.put("duration", "3 Days");
        System.out.println("4. MAP (Key -> Value)       : " + map);

        System.out.println("==================================================");
    }
}
