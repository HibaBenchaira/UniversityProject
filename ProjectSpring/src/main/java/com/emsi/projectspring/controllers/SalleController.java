package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Salle;
import com.emsi.projectspring.services.SalleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class SalleController {
    private SalleService salleService;

    @RequestMapping("/createSalle")
    public String createSalle(ModelMap modelMap) {
        return "CreateSalle";
    }

    @RequestMapping("/saveSalle")
    public String saveSalle(@ModelAttribute Salle salleController){
        Salle savedSalle = salleService.saveSalle(salleController);
        return "CreateSalle";
    }

    @RequestMapping("/sallesList")
    public String sallesList(ModelMap modelMap) {
        List<Salle> sallesController = salleService.getAllSalles();
        modelMap.addAttribute("sallesVue", sallesController);
        return "sallesList";
    }

    @RequestMapping("/deleteSalle")
    public String deleteSalle(@RequestParam("id") Long id, ModelMap modelMap) {
        salleService.deleteSalleById(id);
        return sallesList(modelMap);
    }

    @RequestMapping("/editSalle")
    public String editSalle(@RequestParam("id") Long id, ModelMap modelMap) {
        Salle salleController = salleService.getSalleById(id);
        modelMap.addAttribute("salleView", salleController);

        return "EditSalle";
    }

    @RequestMapping("/updateSalle")
    public String updateSalle(@ModelAttribute("SalleVue") Salle salleController) {
        salleService.updateSalle(salleController);
        return "CreateSalle";
    }
}

