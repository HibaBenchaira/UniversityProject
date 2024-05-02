package com.emsi.projectspring.Services;

import com.emsi.projectspring.repositories.UniversiteRepository;
import com.emsi.projectspring.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServiceImp implements UniversiteService{
    private UniversiteRepository universiteRepository;


    @Override
    public Universite saveUniversite(Universite universite) {
        return universiteRepository.save(universite);

    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversiteById(Long id) {
        universiteRepository.deleteById(id);

    }

    @Override
    public void deleteAllUniversites() {
        universiteRepository.deleteAll();

    }

    @Override
    public Universite getUniversiteById(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();

    }
}
