package com.company.employeeManagement.controller;

import com.company.employeeManagement.model.Team;
import com.company.employeeManagement.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService service;

    public TeamController(
            TeamService service) {

        this.service = service;
    }

    @PostMapping
    public Team create(
            @RequestBody Team team) {

        return service.save(team);
    }

    @GetMapping
    public List<Team> getAll() {

        return service.getAllTeams();
    }
}