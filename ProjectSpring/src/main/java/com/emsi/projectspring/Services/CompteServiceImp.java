package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.repositories.CompteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class CompteServiceImp implements CompteService {
    private CompteRepository compteRepository;
    @Override
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public void deleteCompteById(Long id) {
        compteRepository.deleteById(id);
    }

    @Override
    public void deleteAllComptes() {
        compteRepository.deleteAll();
    }

    @Override
    public Compte getCompteById(Long id) {
        return compteRepository.findById(id).get();
    }

    @Override
    public List<Compte> getAllComptes() {
        return compteRepository.findAll();
    }
}
