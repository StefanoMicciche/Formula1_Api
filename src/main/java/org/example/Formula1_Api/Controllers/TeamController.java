package org.example.Formula1_Api.Controllers;

import org.example.Formula1_Api.DTOs.TeamRequestDTO;
import org.example.Formula1_Api.DTOs.TeamResponseDTO;
import org.example.Formula1_Api.Repository.TeamRepository;
import org.example.Formula1_Api.Services.TeamServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/F1")
public class TeamController {

    private final TeamServices teamServices;

    public TeamController(TeamServices teamServices){this.teamServices = teamServices;}

    @GetMapping("/Teams")
    public ResponseEntity<List<TeamResponseDTO>> getAllTeams(){
        return ResponseEntity.ok(teamServices.getAllTeams());
    }

    @PostMapping("/Teams")
    public ResponseEntity<TeamRepository>   addPilots(@PathVariable Long nro, @RequestBody TeamRequestDTO teamRequestDTO){
        try {
            TeamRepository updateTeam = teamServices.updateTeam(nro, teamRequestDTO);
            return ResponseEntity.ok(updateTeam);
        }catch (RuntimeException e){
            return (ResponseEntity<TeamRepository>) ResponseEntity.status(HttpStatus.NOT_FOUND);
        }
    }

}
