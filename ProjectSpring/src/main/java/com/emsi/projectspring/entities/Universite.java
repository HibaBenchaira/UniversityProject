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
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ERROR NAME")
    private String nomUniversite;
    @OneToMany(mappedBy = "universite", fetch =FetchType.LAZY)
    private List<Faculte> facultes =new ArrayList<>() ;


}
