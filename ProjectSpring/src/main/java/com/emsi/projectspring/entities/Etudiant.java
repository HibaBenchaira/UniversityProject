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
    private String telephone;
    private String address;
    private String email;
    private String password;
    @ManyToOne
    private Filiere filiere;
    @OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
    private List<Dossier> dossiers= new ArrayList<>();
    @OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
    private List<Note> notes = new ArrayList<>();






}
