package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
