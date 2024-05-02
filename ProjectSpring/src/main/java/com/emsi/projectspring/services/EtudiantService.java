package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EtudiantService {
    Etudiant saveEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiantById(Long id);
    void deleteAllEtudiants();
    Etudiant getEtudiantById(Long id);
    List<Etudiant> getAllEtudiants();
}
