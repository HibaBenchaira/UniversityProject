package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Dossier;
import com.emsi.projectspring.repositories.DossierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DossierServiceImp implements DossierService {
    private DossierRepository dossierRepository;
    @Override
    public Dossier saveDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    @Override
    public Dossier updateDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    @Override
    public void deleteDossierById(Long id) {
        dossierRepository.deleteById(id);
    }

    @Override
    public void deleteAllDossiers() {
        dossierRepository.deleteAll();
    }

    @Override
    public Dossier getDossierById(Long id) {
        return dossierRepository.findById(id).get();
    }

    @Override
    public List<Dossier> getAllDossiers() {
        return dossierRepository.findAll();
    }
}
