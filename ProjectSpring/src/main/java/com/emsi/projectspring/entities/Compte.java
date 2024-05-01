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

public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String role;

    @OneToOne(mappedBy = "compte",cascade = CascadeType.ALL)
    private Personnel personnel;

    @OneToOne(mappedBy = "compte",cascade = CascadeType.ALL)
    private Etudiant etudiant;
}
