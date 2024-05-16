package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}