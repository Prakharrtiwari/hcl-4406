package com.abesproject.hclhrms.repository;

import com.abesproject.hclhrms.entity.Employee;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpRepInf implements EmployeeRepo{
    List<Employee> emplist= new ArrayList<>();
    @Override
    public String addEmp(Employee emp) {
        emplist.add(emp);
        return "Employee added successfully!";
    }



    @Override
    public List<Employee> getEmp() {
        return emplist;
    }

    @Override
    public Employee getEmpById(long empid) {
        return null;
    }

    @Override
    public String deleteById(long empid) {
        return "";
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {
        return "";
    }
}
