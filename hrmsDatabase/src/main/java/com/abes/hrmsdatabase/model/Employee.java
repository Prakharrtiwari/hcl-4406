package com.abes.hrmsdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private  long emp_id;
    private  String emp_name;
    private  String stack;

    public Employee(long emp_id, String emp_name, String stack, String designation) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.stack = stack;
        this.designation = designation;
    }

    private String designation;

    // Solution: Default (no-arg) constructor add karein
    public Employee() {
    }


    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", stack='" + stack + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


}
