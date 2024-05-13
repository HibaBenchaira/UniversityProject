package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Fonction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FonctionService {
    Fonction saveFonction(Fonction fonction);
    Fonction updateFonction(Fonction fonction);
    void deleteFonctionById(Long id);
    void deleteAllFonctions();
    Fonction getFonctionById(Long id);
    List<Fonction> getAllFonctions();
}
