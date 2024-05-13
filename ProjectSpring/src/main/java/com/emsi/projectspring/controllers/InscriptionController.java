package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Inscription;
import com.emsi.projectspring.services.InscriptionService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class InscriptionController {
    private final InscriptionService inscriptionService;

    @RequestMapping("/createInscription")
    public String createInscription() {
        return "CreateInscription";
    }

    @RequestMapping("/saveInscription")
    public String saveInscription(@ModelAttribute("inscriptionVue") Inscription inscriptionController) {
        Inscription savedInscription = inscriptionService.saveInscription(inscriptionController);
        return "CreateInscription";
    }

    @RequestMapping("/inscriptionsList")
    public String inscriptionsList(ModelMap modelMap) {
        List<Inscription> inscriptionsController = inscriptionService.getAllInscriptions();
        modelMap.addAttribute("inscriptionsVue", inscriptionsController);
        return "inscriptionsList";
    }

    @RequestMapping("/deleteInscription")
    public String deleteInscription(@RequestParam("id") Long id, ModelMap modelMap) {
        inscriptionService.deleteInscriptionById(id);
        return "redirect:/inscriptionsList";
    }

    @RequestMapping("/editInscription")
    public String editInscription(@RequestParam("id") Long id, ModelMap modelMap) {
        Inscription inscriptionController = inscriptionService.getInscriptionById(id);
        modelMap.addAttribute("inscriptionView", inscriptionController);
        return "EditInscription";
    }

    @RequestMapping("/updateInscription")
    public String updateInscription(@ModelAttribute("inscriptionVue") Inscription inscriptionController) {
        inscriptionService.updateInscription(inscriptionController);
        return "redirect:/createInscription";
    }
}
