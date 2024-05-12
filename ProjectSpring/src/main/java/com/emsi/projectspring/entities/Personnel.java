package com.emsi.projectspring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ERROR NAME")
    private String nomPersonnel;
    @NotBlank(message = "ERROR PHONE NUMBER")
    private String telephone;
    @NotBlank(message = "ERROR EMAIL")
    @Email
    private String email;

    @OneToOne
    @JoinColumn(name = "compte_id", referencedColumnName = "id")
    private Compte compte;

    @OneToMany(mappedBy = "nomPersonnel" , fetch = FetchType.LAZY)
    private List<Dossier> dossiers= new ArrayList<>();
    @ManyToOne
    private FonctionEmployee fonctionEmployee;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "personnel_module",
            joinColumns = @JoinColumn(name = "personnel_id"),
            inverseJoinColumns = @JoinColumn(name = "module_id")
    )

    private List<Module> modules=new ArrayList<>();

}
