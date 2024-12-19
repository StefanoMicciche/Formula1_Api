package org.example.Formula1_Api.DTOs;

import org.example.Formula1_Api.Entities.Team;
import lombok.Builder;

@Builder
public record PilotResponseDTO(

        Long nro,
        String name,
        String points,
        String nationality
        //Team team

){}