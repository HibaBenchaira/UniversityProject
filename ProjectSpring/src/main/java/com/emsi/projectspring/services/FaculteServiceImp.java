package com.emsi.projectspring.services;

import com.emsi.projectspring.repositories.FaculteRepository;
import com.emsi.projectspring.entities.Faculte;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FaculteServiceImp implements FaculteService {
    private FaculteRepository faculteRepository;

    @Override
    public Faculte saveFaculte(Faculte faculte) {
        return faculteRepository.save(faculte);

    }

    @Override
    public Faculte updateFaculte(Faculte faculte) {
        return faculteRepository.save(faculte);
    }

    @Override
    public void deleteFaculteById(Long id) {
        faculteRepository.deleteById(id);

    }

    @Override
    public void deleteAllFacultes() {
        faculteRepository.deleteAll();

    }

    @Override
    public Faculte getFaculteById(Long id) {
        return faculteRepository.findById(id).get();
    }

    @Override
    public List<Faculte> getAllFacultes() {
        return faculteRepository.findAll();
    }
}
