package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Dossier;
import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.services.DossierService;

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
public class DossierController {
    private DossierService dossierService;
    private EtudiantService etudiantService;


    @RequestMapping("/createDossier")
    public String createDossier(ModelMap modelMap) {
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        modelMap.addAttribute("etudiants", etudiants);
        return "CreateDossier";
    }

    @RequestMapping("saveDossier")
    public String saveDossier(@ModelAttribute("dossierVue") Dossier dossierController,ModelMap modelMap){
        Dossier savedDossier = dossierService.saveDossier(dossierController);
        return "CreateDossier";
    }

    @RequestMapping("/dossiersList")
    public String dossiersList(ModelMap modelMap) {
        List<Dossier> dossiersController = dossierService.getAllDossiers();
        modelMap.addAttribute("dossiersVue", dossiersController);
        return "dossiersList";
    }

    @RequestMapping("/deleteDossier")
    public String deleteDossier(@RequestParam("id") Long id, ModelMap modelMap) {
        dossierService.deleteDossierById(id);
        return dossiersList(modelMap);
    }

    @RequestMapping("/editDossier")
    public String editDossier(@RequestParam("id") Long id, ModelMap modelMap) {
        Dossier dossierController = dossierService.getDossierById(id);
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        modelMap.addAttribute("dossierView", dossierController);
        modelMap.addAttribute("etudiants", etudiants);
        return "EditDossier";
    }

    @RequestMapping("/updateDossier")
    public String updateDossier(@ModelAttribute("dossierVue") Dossier dossierController, ModelMap modelMap) {
        dossierService.updateDossier(dossierController);
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        modelMap.addAttribute("etudiants", etudiants);
        return "CreateDossier";
    }
}
