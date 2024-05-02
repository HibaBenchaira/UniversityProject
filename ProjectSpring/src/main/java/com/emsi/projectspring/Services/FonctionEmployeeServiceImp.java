package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.FonctionEmployee;
import com.emsi.projectspring.repositories.FonctionEmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FonctionEmployeeServiceImp implements FonctionEmployeeService {
    private FonctionEmployeeRepository fonctionEmployeeRepository;
    @Override
    public FonctionEmployee saveFonctionEmployee(FonctionEmployee fonctionEmployee) {
        return fonctionEmployeeRepository.save(fonctionEmployee);
    }

    @Override
    public FonctionEmployee updateFonctionEmployee(FonctionEmployee fonctionEmployee) {
        return fonctionEmployeeRepository.save(fonctionEmployee);
    }

    @Override
    public void deleteFonctionEmployeeById(Long id) {
        fonctionEmployeeRepository.deleteById(id);
    }

    @Override
    public void deleteAllFonctionEmployees() {
        fonctionEmployeeRepository.deleteAll();
    }

    @Override
    public FonctionEmployee getFonctionEmployeeById(Long id) {
        return fonctionEmployeeRepository.findById(id).get();
    }

    @Override
    public List<FonctionEmployee> getAllFonctionEmployees() {
        return fonctionEmployeeRepository.findAll();
    }
}
