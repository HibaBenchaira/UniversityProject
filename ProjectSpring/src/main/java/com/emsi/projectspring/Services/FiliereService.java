package com.emsi.projectspring.Services;

import com.emsi.projectspring.entities.Filiere;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FiliereService {
    Filiere saveFiliere(Filiere filiere);
    Filiere updateFiliere(Filiere filiere);
    void deleteFiliereById(Long id);
    void deleteAllFilieres();
    Filiere getFiliereById(Long id);
    List<Filiere> getAllFilieres();
}