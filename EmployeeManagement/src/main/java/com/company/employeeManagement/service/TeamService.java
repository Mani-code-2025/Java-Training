package com.company.employeeManagement.service;

import com.company.employeeManagement.model.Team;

import java.util.List;

public interface TeamService {

    Team save(Team team);

    List<Team> getAllTeams();
}