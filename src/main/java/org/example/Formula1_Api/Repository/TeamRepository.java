package org.example.Formula1_Api.Repository;


import org.example.Formula1_Api.DTOs.TeamResponseDTO;
import org.example.Formula1_Api.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Integer>, List<TeamResponseDTO> {
}
