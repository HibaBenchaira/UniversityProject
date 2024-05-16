package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Salle;
import com.emsi.projectspring.repositories.SalleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SalleServiceImp implements SalleService {
    private SalleRepository salleRepository;
    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public Salle updateSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void deleteSalleById(Long id) {
        salleRepository.deleteById(id);
    }

    @Override
    public void deleteAllSalles() {
        salleRepository.deleteAll();
    }

    @Override
    public Salle getSalleById(Long id) {
        return salleRepository.findById(id).get();
    }

    @Override
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }
}
