package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ERROR NAME")
    private String nomFiliere;

    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY)
    private List<Module> modules= new ArrayList<>();
    @OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY)
    private List<Etudiant> etudiants= new ArrayList<>();
    @OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY)
    private List<Professeur> professeurs= new ArrayList<>();
}
