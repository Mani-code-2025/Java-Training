package com.company.employeeManagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {

    private Long id;

    private String name;

    private List<EmployeeDTO> employees;
}