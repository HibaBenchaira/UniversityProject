package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Inscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InscriptionService {
    Inscription saveInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    void deleteInscriptionById(Long id);
    void deleteAllInscriptions();
    Inscription getInscriptionById(Long id);
    List<Inscription> getAllInscriptions();
}
