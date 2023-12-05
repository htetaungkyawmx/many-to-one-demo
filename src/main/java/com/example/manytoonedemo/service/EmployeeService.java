package com.example.manytoonedemo.service;

import com.example.manytoonedemo.entities.Department;
import com.example.manytoonedemo.entities.Employee;
import com.example.manytoonedemo.repo.DepartmentRepository;
import com.example.manytoonedemo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public void createDatabase(){
        Department department1=new Department("HR");
        Department department2=new Department("Marketing");

        Employee e1=new Employee("John","23","Public Relations");
        Employee e2=new Employee("William","23","Negotiation");

        Employee e3=new Employee("Thomas","33","Statistics");
        Employee e4=new Employee("Lucas","33","Data Analysis");

        e1.setDepartment(department1);
        e2.setDepartment(department1);

        e3.setDepartment(department2);
        e4.setDepartment(department2);

        departmentRepository.save(department1);
        departmentRepository.save(department2);

        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);

    }
}
