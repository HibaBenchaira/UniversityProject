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

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeEvaluation;
    private Double point;


    @OneToMany(mappedBy = "note")
    private List<Etudiant> etudiants= new ArrayList<>();
    @OneToMany(mappedBy = "note")
    private List<Module> modules= new ArrayList<>();

}
