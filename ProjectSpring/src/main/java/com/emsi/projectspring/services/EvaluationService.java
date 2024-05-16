package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Evaluation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EvaluationService {
    Evaluation saveEvaluation(Evaluation evaluation);
    Evaluation updateEvaluation(Evaluation evaluation);
    void deleteEvaluationById(Long id);
    void deleteAllEvaluations();
    Evaluation getEvaluationById(Long id);
    List<Evaluation> getAllEvaluations();
}
