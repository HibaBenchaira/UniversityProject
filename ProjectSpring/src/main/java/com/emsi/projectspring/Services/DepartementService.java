package com.emsi.projectspring.Services;

import com.emsi.projectspring.entities.Departement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartementService {
    Departement saveDepartement(Departement departement);
    Departement updatedepartement(Departement departement);
    void deleteDepartementById(Long id);
    void deleteAllDepartements();
    Departement getDepartementById(Long id);
    List<Departement> getAllDepartements();
}
