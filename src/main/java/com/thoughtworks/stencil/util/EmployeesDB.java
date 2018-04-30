package com.thoughtworks.stencil.util;

import com.thoughtworks.stencil.model.Employee;

import java.util.List;

import static java.util.Arrays.asList;

public class EmployeesDB {

    private static List<Employee> employees = asList(
            createEmployee(1, "小明", 20, "男"),
            createEmployee(2, "小红", 19, "女"),
            createEmployee(3, "小智", 15, "男"),
            createEmployee(4, "小刚", 16, "男"),
            createEmployee(5, "小霞", 15, "女")
    );

    public static List<Employee> getAllEmployees() {
        return employees;
    }

    private static Employee createEmployee(int id, String name, int age, String gender) {
        Employee employee = new Employee(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setGender(gender);
        return employee;
    }


}
