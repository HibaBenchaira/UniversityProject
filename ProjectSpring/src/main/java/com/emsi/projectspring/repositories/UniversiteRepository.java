package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
