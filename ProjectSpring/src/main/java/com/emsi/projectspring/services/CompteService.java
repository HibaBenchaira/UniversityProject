package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Compte;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteService {
    Compte saveCompte(Compte compte);
    Compte updateCompte(Compte compte);
    void deleteCompteById(Long id);
    void deleteAllComptes();
    Compte getCompteById(Long id);
    List<Compte> getAllComptes();
}
