package com.emsi.projectspring.services;

import com.emsi.projectspring.repositories.FiliereRepository;
import com.emsi.projectspring.entities.Filiere;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FiliereServiceImp implements FiliereService{
    private FiliereRepository filiereRepository;

    @Override
    public Filiere saveFiliere(Filiere filiere) {
        return filiereRepository.save(filiere);

    }

    @Override
    public Filiere updateFiliere(Filiere filiere) {
        return filiereRepository.save(filiere);


    }

    @Override
    public void deleteFiliereById(Long id) {
        filiereRepository.deleteById(id);

    }

    @Override
    public void deleteAllFilieres() {
        filiereRepository.deleteAll();

    }

    @Override
    public Filiere getFiliereById(Long id) {
        return filiereRepository.findById(id).get();
    }

    @Override
    public List<Filiere> getAllFilieres() {
        return filiereRepository.findAll();

    }
}
