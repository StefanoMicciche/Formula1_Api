package org.example.Formula1_Api.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int nro;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String teamPrincipal;
    @Column(nullable = false)
    private String pilot;

}
