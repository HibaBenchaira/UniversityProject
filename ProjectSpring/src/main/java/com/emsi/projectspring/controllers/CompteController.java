package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.entities.Etudiant;
import com.emsi.projectspring.entities.Personnel;
import com.emsi.projectspring.services.CompteService;

import com.emsi.projectspring.services.EtudiantService;
import com.emsi.projectspring.services.PersonnelService;
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
public class CompteController {
    private CompteService compteService;
    private EtudiantService etudiantService;
    private PersonnelService personnelService;

    @RequestMapping("/createCompte")
    public String createCompte(ModelMap modelMap) {
        List<Etudiant> etudiants= etudiantService.getAllEtudiants();
        List <Personnel> personnels= personnelService.getAllPersonnels();
        modelMap.addAttribute("etudiants", etudiants);
        modelMap.addAttribute("personnels", personnels);
        return "CreateCompte";
    }

    @RequestMapping("saveCompte")
    public String saveCompte(@ModelAttribute("compteVue") Compte compteController){
        Compte savedCompte = compteService.saveCompte(compteController);
        return "CreateCompte";
    }

    @RequestMapping("/comptesList")
    public String comptesList(ModelMap modelMap) {
        List<Compte> comptesController = compteService.getAllComptes();
        modelMap.addAttribute("comptesVue", comptesController);
        return "comptesList";
    }

    @RequestMapping("/deleteCompte")
    public String deleteCompte(@RequestParam("id") Long id, ModelMap modelMap) {
        compteService.deleteCompteById(id);
        return comptesList(modelMap);
    }

    @RequestMapping("/editCompte")
    public String editCompte(@RequestParam("id") Long id, ModelMap modelMap) {
        Compte compteController = compteService.getCompteById(id);
        modelMap.addAttribute("compteView", compteController);
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        List<Personnel> personnels = personnelService.getAllPersonnels();
        modelMap.addAttribute("etudiants", etudiants);
        modelMap.addAttribute("personnels", personnels);
        return "EditCompte";
    }

    @RequestMapping("/updateCompte")
    public String updateCompte(@ModelAttribute("compteVue") Compte compteController,ModelMap modelMap) {
        compteService.updateCompte(compteController);
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
        List<Personnel> personnels = personnelService.getAllPersonnels();
        modelMap.addAttribute("etudiants", etudiants);
        modelMap.addAttribute("personnels", personnels);
        return "CreateCompte";
    }
}
