package com.thoughtworks.stencil.service;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

import com.thoughtworks.stencil.model.Employee;
import com.thoughtworks.stencil.repository.EmployeeRepository;
import org.junit.Test;

import java.util.List;

public class EmployeeServiceTest {

    private EmployeeRepository employeeRepository;

    @Test
    public void shouldReturnEmployeesWhenTryToGetAllEmployees() {
        //given
        employeeRepository = mock(EmployeeRepository.class);
        given(employeeRepository.findAll()).willReturn(asList(new Employee(1)));

        //when
        EmployeeService employeeService = new EmployeeService(employeeRepository);
        List<Employee> allEmployees = employeeService.getAllEmployees();

        //then
        assertThat(allEmployees.size(), is(1));
        assertThat(allEmployees.get(0).getId(), is(1));
    }
}