package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.entities.Matiere;
import com.emsi.projectspring.services.CompteService;
import com.emsi.projectspring.services.MatiereService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class MatiereController {
    private MatiereService matiereService;

    @RequestMapping("/createMatiere")
    public String createMatiere() {
        return "CreateMatiere";
    }

    @RequestMapping("saveMatiere")
    public String saveMatiere(@ModelAttribute("matiereVue") Matiere matiereController) {
        Matiere savedMatiere = matiereService.saveMatiere(matiereController);
        return "CreateMatiere";
    }

    @RequestMapping("/matieresList")
    public String matieresList(ModelMap modelMap) {
        List<Matiere> matieresController = matiereService.getAllMatieres();
        modelMap.addAttribute("matieresVue", matieresController);
        return "matieresList";
    }

    @RequestMapping("/deleteMatiere")
    public String deleteMatiere(@RequestParam("id") Long id, ModelMap modelMap) {
        matiereService.deleteMatiereById(id);
        return matieresList(modelMap);
    }

    @RequestMapping("/editMatiere")
    public String editMatiere(@RequestParam("id") Long id, ModelMap modelMap) {
        Matiere matiereController = matiereService.getMatiereById(id);
        modelMap.addAttribute("matiereView", matiereController);
        return "EditMatiere";
    }

    @RequestMapping("/updateMatiere")
    public String updateMatiere(@ModelAttribute("matiereVue") Matiere matiereController) {
        matiereService.updateMatiere(matiereController);
        return createMatiere();
    }
}
