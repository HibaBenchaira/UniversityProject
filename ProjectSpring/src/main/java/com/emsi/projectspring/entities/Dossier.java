package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bulletin;
    private String diplome;
    @ManyToOne
    private Personnel nomPersonnel;
    @OneToOne(mappedBy = "dossier",cascade = CascadeType.ALL)
    private Etudiant etudiant;

}
