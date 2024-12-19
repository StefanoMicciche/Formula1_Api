package org.example.Formula1_Api.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record TeamRequestDTO(
        @NotBlank(message = "Team name can´t be empty")
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
        String name,

        @NotBlank(message = "Team principal name cant be empty")
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
        String principalName,

        @NotNull(message = "Number can´t be blank")
        @Pattern(regexp = "\\+?[0-2]{2}" , message = "Number must have at least two digits")
        String nro
){
}