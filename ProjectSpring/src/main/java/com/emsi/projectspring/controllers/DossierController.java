package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Dossier;
import com.emsi.projectspring.services.DossierService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class DossierController {
    private DossierService dossierService;

    @RequestMapping("/createDossier")
    public String createDossier() {
        return "CreateDossier";
    }

    @RequestMapping("saveDossier")
    public String saveDossier(@Valid Dossier dossierController , BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "CreateDossier";
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
        modelMap.addAttribute("dossierView", dossierController);
        return "EditDossier";
    }

    @RequestMapping("/updateDossier")
    public String updateDossier(@ModelAttribute("dossierVue") Dossier dossierController) {
        dossierService.updateDossier(dossierController);
        return createDossier();
    }
}
