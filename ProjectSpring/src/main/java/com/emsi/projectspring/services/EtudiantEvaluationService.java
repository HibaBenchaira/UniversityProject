package com.emsi.projectspring.services;

import com.emsi.projectspring.entities.EtudiantEvaluation;
import com.emsi.projectspring.entities.EtudiantEvaluation.EtudiantEvaluationId;

import java.util.List;

public interface EtudiantEvaluationService {
    EtudiantEvaluation saveEtudiantEvaluation(EtudiantEvaluation etudiantEvaluation);
    EtudiantEvaluation updateEtudiantEvaluation(EtudiantEvaluation etudiantEvaluation);
    void deleteEtudiantEvaluationById(EtudiantEvaluationId id);
    void deleteAllEtudiantEvaluations();
    EtudiantEvaluation getEtudiantEvaluationById(EtudiantEvaluationId id);
    List<EtudiantEvaluation> getAllEtudiantEvaluations();
}
