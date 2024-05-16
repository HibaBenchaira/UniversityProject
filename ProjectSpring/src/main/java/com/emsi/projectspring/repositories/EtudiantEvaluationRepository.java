package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.EtudiantEvaluation;
import com.emsi.projectspring.entities.EtudiantEvaluation.EtudiantEvaluationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantEvaluationRepository extends JpaRepository<EtudiantEvaluation, EtudiantEvaluationId> {
}