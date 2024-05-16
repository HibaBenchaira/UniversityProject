package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.EtudiantEvaluation;
import com.emsi.projectspring.entities.EtudiantEvaluation.EtudiantEvaluationId;
import com.emsi.projectspring.repositories.EtudiantEvaluationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantEvaluationServiceImp implements EtudiantEvaluationService {
    private final EtudiantEvaluationRepository etudiantEvaluationRepository;

    @Override
    public EtudiantEvaluation saveEtudiantEvaluation(EtudiantEvaluation etudiantEvaluation) {
        return etudiantEvaluationRepository.save(etudiantEvaluation);
    }

    @Override
    public EtudiantEvaluation updateEtudiantEvaluation(EtudiantEvaluation etudiantEvaluation) {
        return etudiantEvaluationRepository.save(etudiantEvaluation);
    }

    @Override
    public void deleteEtudiantEvaluationById(EtudiantEvaluationId id) {
        etudiantEvaluationRepository.deleteById(id);
    }

    @Override
    public void deleteAllEtudiantEvaluations() {
        etudiantEvaluationRepository.deleteAll();
    }

    @Override
    public EtudiantEvaluation getEtudiantEvaluationById(EtudiantEvaluationId id) {
        return etudiantEvaluationRepository.findById(id).orElse(null);
    }

    @Override
    public List<EtudiantEvaluation> getAllEtudiantEvaluations() {
        return etudiantEvaluationRepository.findAll();
    }
}
