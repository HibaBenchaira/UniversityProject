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
public class Fonction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank (message = "ERROR NAME")
    private String nomFonction;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name="personnel_module",
            joinColumns = @JoinColumn(name="fonction_id"),
            inverseJoinColumns = @JoinColumn(name="personnel_id")
    )
    private List<Personnel> personnels=new ArrayList<>();




}
