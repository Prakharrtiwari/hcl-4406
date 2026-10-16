public class Main {
    public static void main(String[] args) {
        Employee emp1 = Employee.getInstance();
        Employee emp2 = Employee.getInstance();

        emp1.name = "Rahul";

        System.out.println(emp1.name);
        System.out.println(emp2.name);
        System.out.println(emp1 == emp2);
    }
}
