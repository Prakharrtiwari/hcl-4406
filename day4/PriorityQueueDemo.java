import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> line = new PriorityQueue<>();

        line.offer(50);
        line.offer(10);
        line.offer(30);

        System.out.println("Peek: " + line.peek());
        System.out.println("Poll: " + line.poll());
        System.out.println("Remaining queue: " + line);
    }
}
