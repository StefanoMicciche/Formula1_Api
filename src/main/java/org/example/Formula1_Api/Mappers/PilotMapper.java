package org.example.Formula1_Api.Mappers;

import org.example.Formula1_Api.DTOs.PilotResponseDTO;
import org.example.Formula1_Api.Entities.Pilot;

public class PilotMapper {
    public static PilotResponseDTO toResponse(Pilot pilot) {
        PilotResponseDTO pilotResponseDTO;
        pilotResponseDTO = new PilotResponseDTO();
        return pilotResponseDTO;
    }


}
