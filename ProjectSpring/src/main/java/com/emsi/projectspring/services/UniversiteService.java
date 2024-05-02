package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Universite;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UniversiteService {
    Universite saveUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversiteById(Long id);
    void deleteAllUniversites();
    Universite getUniversiteById(Long id);
    List<Universite> getAllUniversites();
}
