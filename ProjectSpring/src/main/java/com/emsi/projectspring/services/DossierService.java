package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Dossier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DossierService {
    Dossier saveDossier(Dossier dossier);
    Dossier updateDossier(Dossier dossier);
    void deleteDossierById(Long id);
    void deleteAllDossiers();
    Dossier getDossierById(Long id);
    List<Dossier> getAllDossiers();
}
