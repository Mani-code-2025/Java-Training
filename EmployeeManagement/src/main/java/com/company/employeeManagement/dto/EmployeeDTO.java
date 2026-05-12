package com.company.employeeManagement.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private Long id;

    private String name;

    private Double salary;

    private String teamName;
}