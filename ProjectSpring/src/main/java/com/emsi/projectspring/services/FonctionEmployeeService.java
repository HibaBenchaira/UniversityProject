package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.FonctionEmployee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FonctionEmployeeService {
    FonctionEmployee saveFonctionEmployee(FonctionEmployee fonctionEmployee);
    FonctionEmployee updateFonctionEmployee(FonctionEmployee fonctionEmployee);
    void deleteFonctionEmployeeById(Long id);
    void deleteAllFonctionEmployees();
    FonctionEmployee getFonctionEmployeeById(Long id);
    List<FonctionEmployee> getAllFonctionEmployees();


}
