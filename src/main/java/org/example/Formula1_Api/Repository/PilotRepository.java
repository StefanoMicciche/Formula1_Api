package org.example.Formula1_Api.Repository;
import org.example.Formula1_Api.Entities.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<Pilot, Long > {
}