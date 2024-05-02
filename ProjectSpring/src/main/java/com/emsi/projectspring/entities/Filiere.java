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
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomFiliere;


    @OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY)
    private List<Inscription> inscriptions= new ArrayList<>();
    @OneToMany(mappedBy = "filiere",fetch = FetchType.LAZY)
    private List<Module> modules= new ArrayList<>();
}
