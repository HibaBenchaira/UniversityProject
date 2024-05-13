package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.services.EtudiantService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class EtudiantController {
    private final EtudiantService etudiantService;

    @RequestMapping("/createEtudiant")
    public String createEtudiant() {
        return "CreateEtudiant";
    }

    @RequestMapping("/saveEtudiant")
    public String saveEtudiant(@ModelAttribute("etudiantVue") Etudiant etudiantController) {
        Etudiant savedEtudiant = etudiantService.saveEtudiant(etudiantController);
        return "CreateEtudiant";
    }

    @RequestMapping("/etudiantsList")
    public String etudiantsList(ModelMap modelMap) {
        List<Etudiant> etudiantsController = etudiantService.getAllEtudiants();
        modelMap.addAttribute("etudiantsVue", etudiantsController);
        return "etudiantsList";
    }

    @RequestMapping("/deleteEtudiant")
    public String deleteEtudiant(@RequestParam("id") Long id, ModelMap modelMap) {
        etudiantService.deleteEtudiantById(id);
        return "redirect:/etudiantsList";
    }

    @RequestMapping("/editEtudiant")
    public String editEtudiant(@RequestParam("id") Long id, ModelMap modelMap) {
        Etudiant etudiantController = etudiantService.getEtudiantById(id);
        modelMap.addAttribute("etudiantView", etudiantController);
        return "EditEtudiant";
    }

    @RequestMapping("/updateEtudiant")
    public String updateEtudiant(@ModelAttribute("etudiantVue") Etudiant etudiantController) {
        etudiantService.updateEtudiant(etudiantController);
        return "redirect:/createEtudiant";
    }
}
