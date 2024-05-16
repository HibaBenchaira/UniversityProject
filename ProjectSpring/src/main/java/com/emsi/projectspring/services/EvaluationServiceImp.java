package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.Evaluation;

import com.emsi.projectspring.repositories.EvaluationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvaluationServiceImp implements EvaluationService{
    private EvaluationRepository evaluationRepository;
    @Override
    public Evaluation saveEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public Evaluation updateEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public void deleteEvaluationById(Long id) {
        evaluationRepository.deleteById(id);

    }

    @Override
    public void deleteAllEvaluations() {
        evaluationRepository.deleteAll();
    }

    @Override
    public Evaluation getEvaluationById(Long id) {
        return  evaluationRepository.findById(id).get();
    }

    @Override
    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }
}
