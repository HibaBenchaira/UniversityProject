package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Personnel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonnelService {
    Personnel savePersonnel(Personnel personnel);
    Personnel updatePersonnel(Personnel personnel);
    void deletePersonnelById(Long id);
    void deleteAllPersonnels();
    Personnel getPersonnelById(Long id);
    List<Personnel> getAllPersonnels();

}
