package com.abes.hrmsdatabase.controller;

import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired

    private EmployeeService employeeService;

    @GetMapping("/")
    public  String msg(){
        return "Chal gya project!! Khush ho jaaa";
    }

    @GetMapping("/addemp")
    public  String addnewEmployee(){
        return employeeService.createNewEmployee();
    }

    @GetMapping("/getall")
    public List<Employee> getallEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/getbyid/{empid}")
    public Optional<Employee> getbyId(@PathVariable Long empid){
        return employeeService.getById(empid);
    }

    @DeleteMapping("/deletebyid/{empid}")
    public String deleteById(@PathVariable Long empid){
        return employeeService.deletebyid(empid);
    }

}
