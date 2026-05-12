package com.company.employeeManagement.service.impl;

import com.company.employeeManagement.model.Employee;
import com.company.employeeManagement.exception.ResourceNotFoundException;
import com.company.employeeManagement.repo.EmployeeRepository;
import com.company.employeeManagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl
        implements EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(
            EmployeeRepository repository) {

        this.repository = repository;
    }

    @Override
    public Employee save(Employee employee) {

        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee not found"));
    }

    @Override
    public void deleteEmployee(Long id) {

        repository.deleteById(id);
    }

    @Override
    public Map<String, List<Employee>>
    groupByTeam() {

        return repository.findAll()
                .stream()
                .collect(Collectors.groupingBy(
                        e -> e.getTeam().getName()
                ));
    }
}