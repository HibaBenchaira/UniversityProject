package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Matiere;
import com.emsi.projectspring.repositories.DossierRepository;
import com.emsi.projectspring.repositories.MatiereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatiereServiceImp implements MatiereService {
    private MatiereRepository matiereRepository;
    @Override
    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public Matiere updateMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public void deleteMatiereById(Long id) {
        matiereRepository.deleteById(id);
    }

    @Override
    public void deleteAllMatieres() {
        matiereRepository.deleteAll();
    }

    @Override
    public Matiere getMatiereById(Long id) {
        return matiereRepository.findById(id).get();
    }

    @Override
    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }
}
