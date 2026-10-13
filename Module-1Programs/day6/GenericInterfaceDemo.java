
// Generic Interface: Yeh interface kisi bhi type 'T' ke sath kaam kar sakta hai
interface Printer<T> {
    void print(T item);
}

// Dusra Generic Interface jisme data store aur fetch hota hai
interface Storage<T> {
    void save(T data);
    T retrieve();
}

class StringPrinter implements Printer<String> {
    @Override
    public void print(String item) {
        System.out.println("[String Printer] Output: " + item.toUpperCase());
    }
}



class UniversalPrinter<T> implements Printer<T> {
    @Override
    public void print(T item) {
        System.out.println("[Universal Printer] Item: " + item + " | Class: " + item.getClass().getSimpleName());
    }
}


// Storage interface ka implementation (Kisi bhi data ko hold karne ke liye)
class DataBox<T> implements Storage<T> {
    private T savedData;

    @Override
    public void save(T data) {
        this.savedData = data;
        System.out.println("Data successfully save ho gaya: " + data);
    }

    @Override
    public T retrieve() {
        return savedData;
    }
}


public class GenericInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- 1. Fixed Type Generic Interface Implementation ---");
        // StringPrinter sirf String accept karega
        Printer<String> strPrint = new StringPrinter();
        strPrint.print("hello java developers!");

        System.out.println("\n--- 2. Universal Generic Interface Implementation ---");
        // UniversalPrinter kisi bhi type ke sath kaam karega
        Printer<Integer> intPrint = new UniversalPrinter<>();
        intPrint.print(999);

        Printer<Double> doublePrint = new UniversalPrinter<>();
        doublePrint.print(45.50);

        System.out.println("\n--- 3. Storage Interface Implementation ---");
        // String save aur fetch
        Storage<String> userStorage = new DataBox<>();
        userStorage.save("Prakhar");
        String user = userStorage.retrieve();
        System.out.println("Data nikaala: " + user);

        // Integer save aur fetch
        Storage<Integer> otpStorage = new DataBox<>();
        otpStorage.save(4321);
        int otp = otpStorage.retrieve();
        System.out.println("OTP nikaala: " + otp);
    }
}
