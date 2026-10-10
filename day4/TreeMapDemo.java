import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> productPrices = new TreeMap<>();

        productPrices.put("Orange", 60);
        productPrices.put("Apple", 120);
        productPrices.put("Banana", 40);

        System.out.println("First key: " + productPrices.firstKey());
        System.out.println("Last key: " + productPrices.lastKey());
        System.out.println("Price of Apple: " + productPrices.get("Apple"));

        productPrices.remove("Orange");

        System.out.println("TreeMap: " + productPrices);
    }
}
