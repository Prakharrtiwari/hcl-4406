@FunctionalInterface 
interface MyInterface{
    void m1();
}

public class inf{
    public static void main(String[] args){
        MyInterface obj=()->System.out.println("Hello");
        obj.m1();
    }
}


