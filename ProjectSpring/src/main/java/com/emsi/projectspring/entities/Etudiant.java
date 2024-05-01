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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomEtudiant;
    private String Grade;
    private int telephone;
    private String address;
    private String email;

    @OneToOne(mappedBy = "etudiant",cascade = CascadeType.ALL)
    private Compte compte;
    @OneToOne(mappedBy = "etudiant",cascade = CascadeType.ALL)
    private Dossier dossier;



}
