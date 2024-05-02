package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Inscription;
import com.emsi.projectspring.repositories.DossierRepository;
import com.emsi.projectspring.repositories.InscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImp implements InscriptionService {
    private InscriptionRepository inscriptionRepository;
    @Override
    public Inscription saveInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void deleteInscriptionById(Long id) {
        inscriptionRepository.deleteById(id);
    }

    @Override
    public void deleteAllInscriptions() {
        inscriptionRepository.deleteAll();
    }

    @Override
    public Inscription getInscriptionById(Long id) {
        return inscriptionRepository.findById(id).get();
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }
}
