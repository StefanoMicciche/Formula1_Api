package org.example.Formula1_Api.DTOs;

import lombok.Builder;

@Builder
public record PilotResponseDTO() {

    private static Long id;
    private static String name;
    private static String team;
    private static int number;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeam() { return team; }
    public void setTeam(String team) { this.team = team; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
}