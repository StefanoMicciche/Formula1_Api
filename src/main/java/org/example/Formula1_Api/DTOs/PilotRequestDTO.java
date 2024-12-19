package org.example.Formula1_Api.DTOs;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PilotRequestDTO<pilotNro>(
        @NotBlank(message = "Name can´t be empty")
        String name,

        @NotBlank(message = "Nationality can´t be empty")
        String nationality,

        @NotBlank(message = "Team can´t be empty")
        String team){}
