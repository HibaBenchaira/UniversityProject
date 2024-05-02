package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}
