package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Professeur;
import com.emsi.projectspring.repositories.ProfesseurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesseurServiceImp implements ProfesseurService{
    private ProfesseurRepository professeurRepository;
    @Override
    public Professeur saveProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    @Override
    public Professeur updateProfesseur(Professeur professeur) {
        return professeurRepository.save(professeur);
    }

    @Override
    public void deleteProfesseurById(Long id) {
        professeurRepository.deleteById(id);

    }

    @Override
    public void deleteAllProfesseurs() {
        professeurRepository.deleteAll();
    }

    @Override
    public Professeur getProfesseurById(Long id) {
        return  professeurRepository.findById(id).get();
    }

    @Override
    public List<Professeur> getAllProfesseurs() {
        return professeurRepository.findAll();
    }
}
