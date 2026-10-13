import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);

       
        
        System.out.println("\nNumbers greater than 25:");
        list.stream()
            .filter(n -> n > 25)                  
            .forEach(n -> System.out.println(n)); 
            
        long total = list.stream().count();       
        System.out.println("\nTotal elements: " + total);



        //apply stream on strings list
        List<String> list2 = new ArrayList<>();
        list2.add("rahul");
        list2.add("tony");
        list2.add("rohan");
        list2.add("amar");
        list2.add("ravi");

        System.out.println("Original List: " + list2);

       
        
        System.out.println("\nStrings starting with 'r':");
        list2.stream()
            .filter(n -> n.startsWith("r"))                  
            .forEach(n -> System.out.println(n)); 
            
        long total2 = list2.stream().count();       
        System.out.println("\nTotal elements: " + total2);



    }
}
