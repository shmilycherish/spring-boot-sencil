package com.thoughtworks.stencil.controller;

import com.thoughtworks.stencil.model.Employee;
import com.thoughtworks.stencil.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    @ResponseBody
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
}
