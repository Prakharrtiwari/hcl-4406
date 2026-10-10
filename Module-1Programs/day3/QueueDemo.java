// Day 3: Java Collections - Queue & Deque Interfaces
// Queue Characteristics:
// - Designed for holding elements prior to processing
// - Typically FIFO (First-In-First-Out)
// - Deque (Double-Ended Queue): Allows insertion/removal at both ends
// Implementations: PriorityQueue, ArrayDeque, LinkedList (as Queue)

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        QUEUE & DEQUE INTERFACE EXAMPLES  ");
        System.out.println("==========================================");

        // 1. Standard FIFO Queue using LinkedList
        System.out.println("\n--- 1. Standard Queue (FIFO via LinkedList) ---");
        Queue<String> lineQueue = new LinkedList<>();
        lineQueue.offer("Customer 1");
        lineQueue.offer("Customer 2");
        lineQueue.offer("Customer 3");

        System.out.println("Queue: " + lineQueue);
        System.out.println("Front element (peek): " + lineQueue.peek());
        System.out.println("Served (poll): " + lineQueue.poll());
        System.out.println("Queue after poll: " + lineQueue);

        // 2. PriorityQueue: Elements ordered by natural priority (Min-Heap by default)
        System.out.println("\n--- 2. PriorityQueue (Natural Ordering) ---");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(40);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("PriorityQueue elements: " + priorityQueue);
        System.out.println("Polling elements in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " "); // Will output in ascending order: 10 20 30 40
        }
        System.out.println();

        // 3. ArrayDeque: Double-Ended Queue (Insert/Remove at both ends)
        System.out.println("\n--- 3. ArrayDeque (Double-Ended Queue) ---");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front-A");
        deque.addLast("Back-B");
        deque.addFirst("Front-C");
        deque.addLast("Back-D");

        System.out.println("ArrayDeque: " + deque);
        System.out.println("Removed from Front: " + deque.removeFirst());
        System.out.println("Removed from Back: " + deque.removeLast());
        System.out.println("Remaining in ArrayDeque: " + deque);
    }
}
