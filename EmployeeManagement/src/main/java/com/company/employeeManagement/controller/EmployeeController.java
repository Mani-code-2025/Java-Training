package com.company.employeeManagement.controller;

import com.company.employeeManagement.model.Employee;
import com.company.employeeManagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(
            EmployeeService service) {

        this.service = service;
    }

    @PostMapping
    public Employee create(
            @RequestBody Employee employee) {

        return service.save(employee);
    }

    @GetMapping
    public List<Employee> getAll() {

        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(
            @PathVariable Long id) {

        return service.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable Long id) {

        service.deleteEmployee(id);
    }

    @GetMapping("/group-by-team")
    public Map<String, List<Employee>>
    groupByTeam() {

        return service.groupByTeam();
    }
}