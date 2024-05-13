package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Faculte;

import java.util.List;

public interface FaculteService {
    Faculte saveFaculte(Faculte faculte);
    Faculte updateFaculte(Faculte faculte);
    void deleteFaculteById(Long id);
    void deleteAllFacultes();
    Faculte getFaculteById(Long id);
   List<Faculte> getAllFacultes();
}
