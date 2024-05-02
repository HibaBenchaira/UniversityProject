package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.repositories.DossierRepository;
import com.emsi.projectspring.repositories.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImp implements EtudiantService{
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public void deleteAllEtudiants() {
        etudiantRepository.deleteAll();
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return  etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
