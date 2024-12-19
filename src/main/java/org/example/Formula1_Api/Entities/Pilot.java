package org.example.Formula1_Api.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nro;
    @Column
    private String name;
    @Column
    private String team;
    @Column
    private Long points;
    //@OneToMany(cascade = CascadeType.PERSIST)
    //@JoinColumn(name = "teamName", nullable = false);
    //private Team team;

}
