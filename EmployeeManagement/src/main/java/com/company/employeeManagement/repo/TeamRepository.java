package com.company.employeeManagement.repo;

import com.company.employeeManagement.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository
        extends JpaRepository<Team, Long> {
}