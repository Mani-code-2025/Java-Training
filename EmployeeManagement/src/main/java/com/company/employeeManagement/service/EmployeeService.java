package com.company.employeeManagement.service;

import com.company.employeeManagement.dto.EmployeeDTO;
import com.company.employeeManagement.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);

    Map<String, List<Employee>> groupByTeam();
}