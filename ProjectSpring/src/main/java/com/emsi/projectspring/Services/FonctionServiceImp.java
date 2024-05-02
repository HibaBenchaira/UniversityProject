package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Fonction;
import com.emsi.projectspring.repositories.FonctionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FonctionServiceImp implements FonctionService {
    private FonctionRepository fonctionRepository;
    @Override
    public Fonction saveFonction(Fonction fonction) {
        return fonctionRepository.save(fonction);
    }

    @Override
    public Fonction updateFonction(Fonction fonction) {
        return fonctionRepository.save(fonction);
    }

    @Override
    public void deleteFonctionById(Long id) {
        fonctionRepository.deleteById(id);

    }

    @Override
    public void deleteAllFonctions() {
        fonctionRepository.deleteAll();
    }

    @Override
    public Fonction getFonctionById(Long id) {
        return fonctionRepository.findById(id).get();
    }

    @Override
    public List<Fonction> getAllFonctions() {
        return fonctionRepository.findAll();
    }
}
