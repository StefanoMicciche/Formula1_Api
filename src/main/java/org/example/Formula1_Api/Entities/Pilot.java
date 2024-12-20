package org.example.Formula1_Api.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "pilots")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String nationality;
    @ManyToOne
    @JoinColumn(name = "team_id")
    @Column
    private int number;
    @Column
    private String team;
    @Column
    private Long points;

    public Long getId() {
        return id; }
    public String getName() { return name; }
    public String getNationality() { return nationality; }
    public String getTeam() { return team; }
    public int getNumber(int number) { return this.number; }
    public int getPoints(Long points) { return Math.toIntExact(this.points); }

}
