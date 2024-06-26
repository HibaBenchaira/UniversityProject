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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEtudiant;
    private String Grade;
    private String telephone;
    private String address;
    private String email;

    @OneToOne
    @JoinColumn(name = "compte_id", referencedColumnName = "id")
    private Compte compte;
    @OneToOne
    @JoinColumn(name = "dossier_id", referencedColumnName = "id")
    private Dossier dossier;

    @OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
    private List<Inscription> inscriptions= new ArrayList<>();

    @ManyToOne
    private Note note;



}
