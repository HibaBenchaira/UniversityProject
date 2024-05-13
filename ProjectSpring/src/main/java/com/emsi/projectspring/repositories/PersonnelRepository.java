package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
