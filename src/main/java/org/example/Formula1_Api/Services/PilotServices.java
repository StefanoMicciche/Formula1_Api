package org.example.Formula1_Api.Services;

import org.example.Formula1_Api.DTOs.pilotRequestDTO;
import org.example.Formula1_Api.DTOs.PilotResponseDTO;
import org.example.Formula1_Api.Entities.Pilot;
import org.example.Formula1_Api.Entities.Team;
import org.example.Formula1_Api.Exceptions.PilotNotFoundException;
import org.example.Formula1_Api.Exceptions.TeamNotFoundException;
import org.example.Formula1_Api.Mappers.PilotMapper;
import org.example.Formula1_Api.Repository.PilotRepository;
import org.example.Formula1_Api.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PilotServices {

    @Autowired
    private final PilotRepository pilotRepository;
    @Autowired
    private final TeamRepository teamRepository;
    @Autowired
    private PilotMapper pilotMapper;

    public PilotServices(PilotRepository pilotRepository, TeamRepository teamRepository){
        this.pilotRepository = pilotRepository;
        this.teamRepository = teamRepository;
    }

    public PilotResponseDTO createPilot(pilotRequestDTO pilotRequestDTO) throws TeamNotFoundException{
        Team team = teamRepository.findById(pilotRequestDTO.teamId()).orElseThrow(() -> new TeamNotFoundException("Team not found with nro: " + pilotRequestDTO.teamId()));
        Pilot pilot = Pilot.builder()
                .name(pilotRequestDTO.name())
                .number(pilotRequestDTO.getNumber())
                .points(pilotRequestDTO.points())
                .team(String.valueOf(team)).build();

        Pilot savePilot = pilotRepository.save(pilot);
        return PilotMapper.toResponse(savePilot);

    }

    public PilotResponseDTO getPilotByNro(Long nro){
        Pilot pilot = pilotRepository.findById(nro)
                .orElseThrow(() -> new PilotNotFoundException("Pilot not found with that number: " + nro));
        return PilotMapper.toResponse(pilot);
    }

    public List<PilotResponseDTO> getAllPilots(){
        List<Pilot> pilotList = pilotRepository.findAll();
        return pilotList.stream().map(x-> PilotMapper.toResponse(x)).toList();
    }

    public PilotResponseDTO updatePilot(pilotRequestDTO pilotRequestDTO, Long nro) {
        Pilot pilot = pilotRepository.findById(nro)
                .orElseThrow(() -> new PilotNotFoundException("Pilot not found with that number: " + nro));
        Optional<Team> team = teamRepository.findById(pilotRequestDTO.teamName());
        String name = pilotRequestDTO.name();
        pilot.getNumber(pilotRequestDTO.getNumber());
        pilot.getPoints(pilotRequestDTO.points());
        pilot.setTeam(String.valueOf(team));
        Pilot pilotresponse = pilotRepository.save(pilot);
        return PilotMapper.toResponse(pilotresponse);

    }

}
