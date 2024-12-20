package org.example.Formula1_Api.DTOs;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;

record PilotRequestDTO(
        @NotBlank(message = "Name can’t be empty") String name,
        @NotBlank(message = "Nationality can’t be empty") String nationality,
        @NotBlank(message = "Team can’t be empty") String team,
        @NotNull(message = "Number can’t be null") Integer number,
        @NotNull(message = "Points can’t be null") Integer points ){}

public class pilotRequestDTO {
        @Setter
        private String name;
        private String team;
        private int number;
        private Long points;
        public String getName() {
                return name;
        }

        public void setName(String name) {
        }

        public String getTeam() { return team; }

        public void setTeam(String team) { this.team = team; }

        public int getNumber() { return this.number; }

        public void setNumber(int number) { this.number = number; }

        public String name() {
                return this.name;
        }

        public Long points() {
                return this.points;
        }

        public Integer teamId() {
                return this.teamId();
        }

        public Integer teamName() {
                return this.teamName();
        }

        public String teamNro() {
                return this.teamNro();
        }
}