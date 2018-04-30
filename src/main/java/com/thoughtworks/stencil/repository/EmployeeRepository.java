package com.thoughtworks.stencil.repository;

import com.thoughtworks.stencil.model.Employee;
import com.thoughtworks.stencil.util.EmployeesDB;

import java.util.List;

public class EmployeeRepository {
    public List<Employee> findAll() {
        return EmployeesDB.getAllEmployees();
    }
}
