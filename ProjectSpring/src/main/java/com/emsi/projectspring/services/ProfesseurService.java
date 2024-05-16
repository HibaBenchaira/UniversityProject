package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Professeur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProfesseurService {
    Professeur saveProfesseur(Professeur professeur);
    Professeur updateProfesseur(Professeur professeur);
    void deleteProfesseurById(Long id);
    void deleteAllProfesseurs();
    Professeur getProfesseurById(Long id);
    List<Professeur> getAllProfesseurs();
}
