
// Practice Question
// create an arraylist of employee type and apply crud operation on the 
// employee object use iterator and list iterator both to traverse 
// the employees apart from these we need to iterate these employees 
// on the decreasing and increasing order


import java.util.*;



class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    @Override 
    public String toString(){
        return "Employee [id=" +id+ ",Name=" +name+ ",Salary=" +salary+ "]";
    }




}

public class Main{
    public static void main(String[] args){
        ArrayList<Employee> emplist= new ArrayList<>();
        

        // Adding employee objects to the arraylist
        emplist.add(new Employee(103, "raghu", 50000));
        emplist.add(new Employee(104, "Aman", 80000));
        emplist.add(new Employee(105, "Ravi", 60000));
        emplist.add(new Employee(106, "Ramesh", 70000));
        

        // Displaying the employee list
        System.out.println("Employee List: ");
        for(Employee emp:emplist){
            System.out.println(emp);
        }


        //updating an employee's salary
        for(Employee emp:emplist){
            if(emp.id==105){
                emp.salary=10000;
                System.out.println("Updated Employee: " + emp);
            }
        }

        //deleting an employee from the list
        for(Employee emp:emplist){
            if(emp.id==104){
                emplist.remove(emp);
                System.out.println("Employee removed: " + emp);
                break;
            }
        }

        //traversing the employee list using iterator
        System.out.println(" Traversing using Iterator");
        Iterator<Employee> iterator=emplist.iterator();
        while(iterator.hasNext()){
            Employee emp=iterator.next();
            System.out.println(emp);
        }


        //using list iterator to traverse the employee list
        System.out.println(" Traversing using ListIterator");
        ListIterator<Employee> ListIterator=emplist.listIterator();
        while(ListIterator.hasNext()){
            Employee emp=ListIterator.next();
            System.out.println(emp);
        }
        while(ListIterator.hasPrevious()){
            Employee emp=ListIterator.previous();
            System.out.println(emp);
        }


        //increaing by id
        System.out.println("Traversing in increasing order of id");
        Collections.sort(emplist, new Comparator<Employee>(){
            @Override 
            public int compare(Employee e1, Employee e2){
                return Integer.compare(e1.id, e2.id);
            }
        });
        for(Employee emp:emplist){
            System.out.println(emp);
        }

        //decreasing by id
        System.out.println("Traversing in decreasing order of id");
        Collections.sort(emplist, new Comparator<Employee>(){
            @Override 
            public int compare(Employee e1, Employee e2){
                return Integer.compare(e2.id, e1.id);
            }
        });
        for(Employee emp:emplist){
            System.out.println(emp);
        }






    }
}