package org.example.Formula1_Api.DTOs;

import lombok.Builder;

@Builder
public record TeamResponseDTO (
        Long nro,
        String name,
        String teamPrincipal,
        String pilots
){}