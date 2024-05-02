package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.FonctionEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FonctionEmployeeRepository extends JpaRepository<FonctionEmployee, Long> {
}
