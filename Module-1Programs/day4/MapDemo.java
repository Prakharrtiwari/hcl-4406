import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Roll_01", 85);
        hashMap.put("Roll_02", 92);
        hashMap.put("Roll_01", 90);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Roll_01 Marks: " + hashMap.get("Roll_01"));

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", "Java");
        linkedHashMap.put("Two", "Python");
        linkedHashMap.put("Three", "C++");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 5);
        treeMap.put("Apple", 10);
        treeMap.put("Mango", 7);
        System.out.println("TreeMap: " + treeMap);
    }
}
