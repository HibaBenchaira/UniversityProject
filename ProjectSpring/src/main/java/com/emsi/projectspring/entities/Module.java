package com.emsi.projectspring.entities;

import jakarta.persistence.*;
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
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomModule;
    private Double volumeHoraire;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name="personnel_module",
        joinColumns = @JoinColumn(name="module_id"),
        inverseJoinColumns = @JoinColumn(name="personnel_id")
    )
    private List<Personnel> personnels=new ArrayList<>();

    @ManyToOne
    private Note note;
    @OneToMany(mappedBy = "nomModule",fetch = FetchType.LAZY)
    private List<Matiere> matieres= new ArrayList<>();
    @ManyToOne
    private Filiere nomFiliere;
}
