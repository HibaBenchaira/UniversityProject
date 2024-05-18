package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.*;
import com.emsi.projectspring.entities.Module;
import com.emsi.projectspring.services.*;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class EvaluationController {
    private final EvaluationService evaluationService;
    private ModuleService moduleService;

    @RequestMapping("/createEvaluation")
    public String createEvaluation(ModelMap modelMap) {
        List <Module> modules = moduleService.getAllModules();
        modelMap.addAttribute("modules", modules);
        return "CreateEvaluation";
    }

    @RequestMapping("/saveEvaluation")
    public String saveEvaluation(@ModelAttribute("evaluationVue") Evaluation evaluationController) {
        Evaluation savedEvaluation = evaluationService.saveEvaluation(evaluationController);
        return "CreateEvaluation";
    }

    @RequestMapping("/evaluationsList")
    public String EvaluationsList(ModelMap modelMap) {
        List<Evaluation> evaluationsController = evaluationService.getAllEvaluations();
        modelMap.addAttribute("evaluationsVue", evaluationsController);
        return "evaluationsList";
    }

    @RequestMapping("/deleteEvaluation")
    public String deleteEvaluation(@RequestParam("id") Long id, ModelMap modelMap) {
        evaluationService.deleteEvaluationById(id);
        return "redirect:/EvaluationsList";
    }

    /*@RequestMapping("/editEvaluation")
    public String editEvaluation(@RequestParam("id") Long id, ModelMap modelMap) {
        Evaluation evaluationController = evaluationService.getEvaluationById(id);
        modelMap.addAttribute("evaluationView", evaluationController);
        List <Module> modules = moduleService.getAllModules();
        modelMap.addAttribute("modules", modules);
        return "EditEvaluation";
    }*/

    @RequestMapping("/updateEvaluation")
    public String updateEvaluation(@ModelAttribute("evaluationVue") Evaluation evaluationController,ModelMap modelMap) {
        evaluationService.updateEvaluation(evaluationController);
        return "CreateEvaluation";
    }
}
