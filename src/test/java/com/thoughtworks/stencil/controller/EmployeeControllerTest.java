package com.thoughtworks.stencil.controller;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import com.thoughtworks.stencil.model.Employee;
import com.thoughtworks.stencil.service.EmployeeService;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class EmployeeControllerTest {

    private EmployeeService employeeService;

    @Test
    public void shouldReturnSuccessResponse() throws Exception {
        //given
        employeeService = mock(EmployeeService.class);
        given(employeeService.getAllEmployees()).willReturn(asList(new Employee(1)));

        //when
        EmployeeController employeeController = new EmployeeController(employeeService);
        ResponseEntity employeesResponse = employeeController.getEmployees();
        //then
        assertThat(employeesResponse.getStatusCode(), is(HttpStatus.OK));
        List<Employee> employees = (List<Employee>) employeesResponse.getBody();
        assertThat(employees.size(), is(1));
    }
}