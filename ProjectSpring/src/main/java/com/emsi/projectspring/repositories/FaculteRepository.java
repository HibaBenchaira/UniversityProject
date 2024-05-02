package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaculteRepository extends JpaRepository<Faculte,Long> {
}
