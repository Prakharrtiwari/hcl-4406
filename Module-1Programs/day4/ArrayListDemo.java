import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Prakhar");
        names.add("Aman");
        names.add("Prakhar");

        System.out.println("Element at index 1: " + names.get(1));

        names.set(1, "Sachin");
        names.remove(0);

        System.out.println("Size: " + names.size());
        System.out.println("List: " + names);
    }
}
