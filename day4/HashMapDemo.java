import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Roll_01", 85);
        studentMarks.put("Roll_02", 92);

        System.out.println("Roll_01 marks: " + studentMarks.get("Roll_01"));

        studentMarks.put("Roll_01", 90);

        System.out.println("Contains Roll_03: " + studentMarks.containsKey("Roll_03"));

        studentMarks.remove("Roll_02");

        System.out.println("Keys: " + studentMarks.keySet());
        System.out.println("Map: " + studentMarks);
    }
}
