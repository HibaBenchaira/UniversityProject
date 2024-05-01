package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToMany(mappedBy = "fonctionEmployee")
    private List<Personnel> personnels= new ArrayList<>();

    @OneToMany(mappedBy = "fonctionEmployee")
    private List<Fonction> fonctions=new ArrayList<>();


}
