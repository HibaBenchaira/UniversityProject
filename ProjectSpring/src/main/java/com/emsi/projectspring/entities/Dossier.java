package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ERROR DIPLOME")
    private String diplome;
    @NotBlank(message = "ERROR DATE_INSCRIPTION")
    private Date date_inscription;
    @ManyToOne
    private Etudiant etudiant;


}
