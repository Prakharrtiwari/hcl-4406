import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Japan", "Tokyo");

        System.out.println("Capital of India: " + capitalCities.get("India"));
        System.out.println("Contains UK: " + capitalCities.containsKey("UK"));

        capitalCities.remove("USA");

        System.out.println("All countries: " + capitalCities.keySet());
        System.out.println("LinkedHashMap: " + capitalCities);
    }
}
