package com.emsi.projectspring.Services;

import com.emsi.projectspring.repositories.DepartementRepository;
import com.emsi.projectspring.entities.Departement;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class DepartementServiceImp implements DepartementService{
    private DepartementRepository departementRepository;


    @Override
    public Departement saveDepartement(Departement departement) {
        return departementRepository.save(departement);

    }

    @Override
    public Departement updatedepartement(Departement departement) {
        return departementRepository.save(departement);

    }

    @Override
    public void deleteDepartementById(Long id) {
        departementRepository.deleteById(id);

    }

    @Override
    public void deleteAllDepartements() {
        departementRepository.deleteAll();

    }

    @Override
    public Departement getDepartementById(Long id) {
        return departementRepository.findById(id).get();

    }

    @Override
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();

    }
}
