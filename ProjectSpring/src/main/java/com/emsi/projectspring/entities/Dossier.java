package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "ERROR BULLETIN")
    private String bulletin;
    @NotBlank(message = "ERROR DIPLOME")
    private String diplome;

    @ManyToOne
    private Personnel nomPersonnel;
    
    @OneToOne
    @JoinColumn(name = "etudiant_id", referencedColumnName = "id")
    private Etudiant etudiant;

}
