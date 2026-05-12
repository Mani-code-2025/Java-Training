package com.company.employeeManagement.service.impl;

import com.company.employeeManagement.model.Team;
import com.company.employeeManagement.repo.TeamRepository;
import com.company.employeeManagement.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl
        implements TeamService {

    private final TeamRepository repository;

    public TeamServiceImpl(
            TeamRepository repository) {

        this.repository = repository;
    }

    @Override
    public Team save(Team team) {

        return repository.save(team);
    }

    @Override
    public List<Team> getAllTeams() {

        return repository.findAll();
    }
}