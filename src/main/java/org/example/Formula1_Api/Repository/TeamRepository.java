package org.example.Formula1_Api.Repository;


import org.example.Formula1_Api.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository <Team, Integer> {
}
