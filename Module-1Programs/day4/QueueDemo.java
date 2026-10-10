import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        System.out.println("PriorityQueue peek: " + pq.peek());
        System.out.println("PriorityQueue poll: " + pq.poll());

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offerFirst("A");
        deque.offerLast("B");
        deque.offerLast("C");
        System.out.println("Deque: " + deque);
        System.out.println("Deque pollFirst: " + deque.pollFirst());
        System.out.println("Deque pollLast: " + deque.pollLast());
    }
}
