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
    @ManyToOne
    private Filiere filiere;
    @OneToMany(mappedBy = "module",fetch = FetchType.LAZY)
    private List<Note> notes= new ArrayList<>();
}
