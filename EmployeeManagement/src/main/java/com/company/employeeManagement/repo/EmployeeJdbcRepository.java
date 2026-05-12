package com.company.employeeManagement.repo;

import com.company.employeeManagement.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeJdbcRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeJdbcRepository(
            JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Employee> getEmployees() {

        String sql = "SELECT * FROM employee";

        return jdbcTemplate.query(sql,
                (rs, rowNum) -> {

                    Employee employee = new Employee();

                    employee.setId(rs.getLong("id"));
                    employee.setName(rs.getString("name"));
                    employee.setSalary(
                            rs.getDouble("salary"));

                    return employee;
                });
    }
}