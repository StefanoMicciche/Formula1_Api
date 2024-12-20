package org.example.Formula1_Api.Controllers;

import org.example.Formula1_Api.DTOs.pilotRequestDTO;
import org.example.Formula1_Api.DTOs.PilotResponseDTO;

import org.example.Formula1_Api.Services.PilotServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/f1")
public class PilotController {

    private final PilotServices pilotServices;

    public PilotController (PilotServices pilotServices){this.pilotServices= pilotServices;}

    public ResponseEntity<List<PilotResponseDTO>> getAllPilots() {
        return ResponseEntity.ok(pilotServices.getAllPilots());
    }

    @GetMapping ("/pilots/{nro}")
    public ResponseEntity<PilotResponseDTO> getPilotByNro(@PathVariable int nro){
        var pilotResponseDTO = pilotServices.getPilotByNro((long) nro);
        return ResponseEntity.ok(pilotResponseDTO);
    }

    @PutMapping ("/pilots/")
    public ResponseEntity<PilotResponseDTO> updatePilot (@PathVariable int nro, @RequestBody pilotRequestDTO pilotRequestDTO){
        try {
            PilotResponseDTO updatePilot = pilotServices.updatePilot(pilotRequestDTO, (long) nro);
            return ResponseEntity.ok(updatePilot);
        }catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
