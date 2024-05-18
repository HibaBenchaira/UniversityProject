package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.entities.EtudiantEvaluation;
import com.emsi.projectspring.entities.Evaluation;
import com.emsi.projectspring.services.EtudiantEvaluationService;
import com.emsi.projectspring.services.EtudiantService;
import com.emsi.projectspring.services.EvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class EtudiantEvaluationController {
    private  EtudiantEvaluationService etudiantEvaluationService;
    private EtudiantService etudiantService;
    private EvaluationService evaluationService;
    @RequestMapping("/createEtudiantEvaluation")
    public String createEtudiantEvaluation(ModelMap modelMap) {
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        modelMap.addAttribute("etudiants", etudiants);
        List<Evaluation> evaluations = evaluationService.getAllEvaluations();
        modelMap.addAttribute("evaluations", evaluations);
        return "CreateEtudiantEvaluation";
    }

    @RequestMapping("/saveEtudiantEvaluation")
    public String saveEtudiantEvaluation(@ModelAttribute("etudiantEvaluationVue") EtudiantEvaluation etudiantEvaluationController) {
        EtudiantEvaluation savedEtudiantEvaluation = etudiantEvaluationService.saveEtudiantEvaluation(etudiantEvaluationController);
        return "CreateEtudiantEvaluation";
    }

    @RequestMapping("/EtudiantEvaluationsList")
    public String EtudiantEvaluationsList(ModelMap modelMap) {
        List<EtudiantEvaluation> etudiantEvaluationsController = etudiantEvaluationService.getAllEtudiantEvaluations();
        modelMap.addAttribute("etudiantEvaluationsVue", etudiantEvaluationsController);
        return "EtudiantEvaluationsList";
    }

    @RequestMapping("/deleteEtudiantEvaluation")
    public String deleteEtudiantEvaluation(@RequestParam("id") EtudiantEvaluation.EtudiantEvaluationId id, ModelMap modelMap) {
        etudiantEvaluationService.deleteEtudiantEvaluationById(id);
        return "redirect:/EtudiantEvaluationsList";
    }

    /*@RequestMapping("/editEtudiantEvaluation")
    public String editEtudiantEvaluation(@RequestParam("id") Long id, ModelMap modelMap) {
        EtudiantEvaluation EtudiantEvaluationController = EtudiantEvaluationService.getEtudiantEvaluationById(id);
        modelMap.addAttribute("EtudiantEvaluationView", EtudiantEvaluationController);
        List <Filiere> filieres = filiereService.getAllFilieres();
        modelMap.addAttribute("filieres", filieres);
        return "EditEtudiantEvaluation";
    }*/

    @RequestMapping("/updateEtudiantEvaluation")
    public String updateEtudiantEvaluation(@ModelAttribute("etudiantEvaluationVue") EtudiantEvaluation etudiantEvaluationController,ModelMap modelMap) {
        etudiantEvaluationService.updateEtudiantEvaluation(etudiantEvaluationController);
        return "CreateEtudiantEvaluation";
    }
}
