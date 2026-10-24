package com.abes.hrmsdatabase.service;

import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createNewEmployee(){
        Employee empl =new Employee(400,"Ram","FSD","Teacher");
        employeeRepository.save(empl);
        return "Employee is added succsessfuly";
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();

    }
    public Optional<Employee> getById(long id){
        return employeeRepository.findById(id);

    }
    public String deletebyid(long id){
        employeeRepository.deleteById(id);
        return "Done";
    }
    public String deleteall(){
        employeeRepository.deleteAll();
        return "Done";
    }

}
