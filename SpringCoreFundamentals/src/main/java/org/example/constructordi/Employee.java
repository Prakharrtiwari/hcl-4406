package org.example.constructordi;

public class Employee {
    public Address address;

    public Employee(Address address){
        this.address=address;
    }

    public  void getEmpAddress(){
        address.getAddress();
    }
}
