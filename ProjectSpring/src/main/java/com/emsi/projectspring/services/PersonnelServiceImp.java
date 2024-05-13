package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Personnel;
import com.emsi.projectspring.repositories.PersonnelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonnelServiceImp implements PersonnelService{
    private PersonnelRepository personnelRepository;

    @Override
    public Personnel savePersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    @Override
    public Personnel updatePersonnel(Personnel personnel) {
        return personnelRepository.save(personnel);
    }

    @Override
    public void deletePersonnelById(Long id) {
        personnelRepository.deleteById(id);

    }

    @Override
    public void deleteAllPersonnels() {
        personnelRepository.deleteAll();

    }

    @Override
    public Personnel getPersonnelById(Long id) {
        return personnelRepository.findById(id).get();
    }

    @Override
    public List<Personnel> getAllPersonnels() {
        return personnelRepository.findAll();
    }
}
