package com.emsi.projectspring.repositories;
import com.emsi.projectspring.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Long> {
}
