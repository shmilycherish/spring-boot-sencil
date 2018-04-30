package com.thoughtworks.stencil.repository;

import com.thoughtworks.stencil.model.Employee;
import com.thoughtworks.stencil.util.EmployeesDB;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepository {
    public List<Employee> findAll() {
        return EmployeesDB.getAllEmployees();
    }
}
