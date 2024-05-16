package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Salle;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SalleService {
    Salle saveSalle(Salle salle);
    Salle updateSalle(Salle salle);
    void deleteSalleById(Long id);
    void deleteAllSalles();
    Salle getSalleById(Long id);
    List<Salle> getAllSalles();
}
