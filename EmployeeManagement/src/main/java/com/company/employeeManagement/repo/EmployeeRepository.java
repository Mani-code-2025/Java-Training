package com.company.employeeManagement.repo;

import com.company.employeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}