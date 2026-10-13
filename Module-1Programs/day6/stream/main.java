import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        // 1. Ek simple List banayi
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

        // 2. Stream banaya
        // filter()  -> Non-Terminal operation (condition lagata hai)
        // forEach() -> Terminal operation (result print karta hai)
        
        System.out.println("\nNumbers greater than 25:");
        list.stream()
            .filter(n -> n > 25)                  // Non-terminal
            .forEach(n -> System.out.println(n)); // Terminal
            
        // Terminal operation ka ek aur simple example: count()
        long total = list.stream().count();       // Terminal
        System.out.println("\nTotal elements: " + total);
    }
}
