package org.example.Formula1_Api.Services;

import org.example.Formula1_Api.DTOs.TeamRequestDTO;
import org.example.Formula1_Api.DTOs.TeamResponseDTO;
import org.example.Formula1_Api.Repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServices {
    private final TeamRepository teamRepository;

    public  TeamServices(TeamRepository teamRepository){ this.teamRepository = teamRepository;}

    public TeamResponseDTO createTeam(TeamRequestDTO teamRequestDTO) {
       // Team team = TeamMapper.
        return null;
    }

    public List<TeamResponseDTO> getAllTeams() {
        return teamRepository;
    }

    public TeamRepository updateTeam(Long nro, TeamRequestDTO teamRequestDTO) {
        return teamRepository;
    }
}
