import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("Book A");
        books.push("Book B");
        books.push("Book C");

        System.out.println("Top element: " + books.peek());
        System.out.println("Popped element: " + books.pop());
        System.out.println("Is stack empty: " + books.isEmpty());
        System.out.println("Stack: " + books);
    }
}
