package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.services.CompteService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class CompteController {
    private CompteService compteService;

    @RequestMapping("/createCompte")
    public String createCompte() {
        return "CreateCompte";
    }

    @RequestMapping("saveCompte")
    public String saveCompte(@ModelAttribute("compteVue") Compte compteController) {
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
        return "EditCompte";
    }

    @RequestMapping("/updateCompte")
    public String updateCompte(@ModelAttribute("compteVue") Compte compteController) {
        compteService.updateCompte(compteController);
        return createCompte();
    }
}
