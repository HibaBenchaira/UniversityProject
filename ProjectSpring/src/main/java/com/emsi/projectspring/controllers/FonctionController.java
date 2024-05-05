package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Fonction;
import com.emsi.projectspring.services.FonctionService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class FonctionController {
    private FonctionService fonctionService;

    @RequestMapping("/createFonction")
    public String createFonction() {
        return "CreateFonction";
    }

    @RequestMapping("saveFonction")
    public String saveFonction(@ModelAttribute("fonctionVue") Fonction fonctionController) {
        Fonction savedFonction = fonctionService.saveFonction(fonctionController);
        return "CreateFonction";
    }

    @RequestMapping("/fonctionsList")
    public String fonctionsList(ModelMap modelMap) {
        List<Fonction> fonctionsController = fonctionService.getAllFonctions();
        modelMap.addAttribute("fonctionsVue", fonctionsController);
        return "fonctionsList";
    }

    @RequestMapping("/deleteFonction")
    public String deleteFonction(@RequestParam("id") Long id, ModelMap modelMap) {
        fonctionService.deleteFonctionById(id);
        return fonctionsList(modelMap);
    }

    @RequestMapping("/editFonction")
    public String editFonction(@RequestParam("id") Long id, ModelMap modelMap) {
        Fonction fonctionController = fonctionService.getFonctionById(id);
        modelMap.addAttribute("fonctionView", fonctionController);
        return "EditFonction";
    }

    @RequestMapping("/updateFonction")
    public String updateFonction(@ModelAttribute("fonctionVue") Fonction fonctionController) {
        fonctionService.updateFonction(fonctionController);
        return createFonction();
    }
}
