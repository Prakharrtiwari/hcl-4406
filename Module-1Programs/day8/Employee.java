public class Employee {
    private static Employee instance;

    public String name;

    private Employee() {
        name = "Default Employee";
    }

    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }
}
