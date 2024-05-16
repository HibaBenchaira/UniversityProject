package com.emsi.projectspring.repositories;

import com.emsi.projectspring.entities.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}