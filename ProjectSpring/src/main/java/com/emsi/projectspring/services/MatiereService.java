package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.entities.Matiere;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatiereService {
    Matiere saveMatiere(Compte matiere);
    Matiere updateMatiere(Matiere matiere);
    void deleteMatiereById(Long id);
    void deleteAllMatieres();
    Matiere getMatiereById(Long id);
    List<Matiere> getAllMatieres();
}
