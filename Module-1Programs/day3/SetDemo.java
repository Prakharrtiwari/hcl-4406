import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
       

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Elephant");
        hashSet.add("Dog"); // Duplicate - will be ignored
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Cat'? " + hashSet.contains("Cat"));

      
        System.out.println("\n--- 2. LinkedHashSet (Maintains insertion order) ---");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        linkedHashSet.add("Green"); 
        System.out.println("LinkedHashSet: " + linkedHashSet);

       
        System.out.println("\n--- 3. TreeSet (Sorted Order) ---");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(12);
        treeSet.add(89);
        treeSet.add(23);
        treeSet.add(12);
        System.out.println("TreeSet (Ascending sorted): " + treeSet);
    }
}
