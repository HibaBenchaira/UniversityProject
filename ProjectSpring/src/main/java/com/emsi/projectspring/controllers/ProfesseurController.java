package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Professeur;
import com.emsi.projectspring.entities.Filiere;
import com.emsi.projectspring.services.ProfesseurService;
import com.emsi.projectspring.services.FiliereService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProfesseurController {
    private  ProfesseurService professeurService;
    private FiliereService filiereService;

    @RequestMapping("/createProfesseur")
    public String createProfesseur(ModelMap modelMap) {
        List <Filiere> filieres = filiereService.getAllFilieres();
        modelMap.addAttribute("filieres", filieres);
        return "CreateProfesseur";
    }

    @RequestMapping("/saveProfesseur")
    public String saveProfesseur(@ModelAttribute("professeurVue") Professeur professeurController) {
        Professeur savedProfesseur = professeurService.saveProfesseur(professeurController);
        return "CreateProfesseur";
    }

    @RequestMapping("/ProfesseursList")
    public String ProfesseursList(ModelMap modelMap) {
        List<Professeur> professeursController = professeurService.getAllProfesseurs();
        modelMap.addAttribute("professeursVue", professeursController);
        return "ProfesseursList";
    }

    @RequestMapping("/deleteProfesseur")
    public String deleteProfesseur(@RequestParam("id") Long id, ModelMap modelMap) {
        professeurService.deleteProfesseurById(id);
        return "redirect:/ProfesseursList";
    }

    /*@RequestMapping("/editProfesseur")
    public String editProfesseur(@RequestParam("id") Long id, ModelMap modelMap) {
        Professeur ProfesseurController = ProfesseurService.getProfesseurById(id);
        modelMap.addAttribute("ProfesseurView", ProfesseurController);
        List <Filiere> filieres = filiereService.getAllFilieres();
        modelMap.addAttribute("filieres", filieres);
        return "EditProfesseur";
    }*/

    @RequestMapping("/updateProfesseur")
    public String updateProfesseur(@ModelAttribute("professeurVue") Professeur professeurController,ModelMap modelMap) {
        professeurService.updateProfesseur(professeurController);
        return "CreateProfesseur";
    }
}
