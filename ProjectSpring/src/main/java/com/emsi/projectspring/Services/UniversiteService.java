package com.emsi.projectspring.Services;

import com.emsi.projectspring.entities.Universite;

import java.util.List;

public interface UniversiteService {
    Universite saveUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversiteById(Long id);
    void deleteAllUniversites();
    Universite getUniversiteById(Long id);
    List<Universite> getAllUniversites();
}
