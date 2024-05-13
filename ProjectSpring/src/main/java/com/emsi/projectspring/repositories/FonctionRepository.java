package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FonctionRepository extends JpaRepository<Fonction, Long> {
}
