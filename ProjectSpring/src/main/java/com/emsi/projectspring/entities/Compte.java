package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ERROR LOGIN")
    private String login;
    @NotBlank(message = "ERROR PASSWORD")
    private String password;
    @NotBlank(message = "ERROR ROLE")
    private String role;

    @OneToOne
    @JoinColumn(name ="personal_id" , referencedColumnName = "id")
    private Personnel personnel;

    @OneToOne
    @JoinColumn(name = "etudiant_id", referencedColumnName = "id")
    private Etudiant etudiant;
}
