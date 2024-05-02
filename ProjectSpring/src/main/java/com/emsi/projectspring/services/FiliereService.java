package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Filiere;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FiliereService {
    Filiere saveFiliere(Filiere filiere);
    Filiere updateFiliere(Filiere filiere);
    void deleteFiliereById(Long id);
    void deleteAllFilieres();
    Filiere getFiliereById(Long id);
    List<Filiere> getAllFilieres();
}
