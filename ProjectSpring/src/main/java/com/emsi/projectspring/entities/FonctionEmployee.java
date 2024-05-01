package com.emsi.projectspring.entities;

import jakarta.persistence.*;
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

public class FonctionEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDebut;
    @ManyToOne
    @JoinColumn(name="personnel_id")
    private Personnel personnel;

    @ManyToOne
    @JoinColumn(name="fonction_id")
    private Fonction fonction;

}
