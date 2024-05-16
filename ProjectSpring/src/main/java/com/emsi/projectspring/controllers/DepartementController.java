package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Departement;
import com.emsi.projectspring.services.DepartementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class DepartementController {
    private DepartementService departementService;

    @RequestMapping("/createDepartement")
    public String createDepartement(ModelMap modelMap) {
        return "CreateDepartement";
    }

    @RequestMapping("/saveDepartement")
    public String saveDepartement(@ModelAttribute Departement departementController){
        Departement savedDepartement = departementService.saveDepartement(departementController);
        return "CreateDepartement";
    }

    @RequestMapping("/departementsList")
    public String departementsList(ModelMap modelMap) {
        List<Departement> departementsController = departementService.getAllDepartements();
        modelMap.addAttribute("departementsVue", departementsController);
        return "departementsList";
    }

    @RequestMapping("/deleteDepartement")
    public String deleteDepartement(@RequestParam("id") Long id, ModelMap modelMap) {
        departementService.deleteDepartementById(id);
        return departementsList(modelMap);
    }

    @RequestMapping("/editDepartement")
    public String editDepartement(@RequestParam("id") Long id, ModelMap modelMap) {
        Departement departementController = departementService.getDepartementById(id);
        modelMap.addAttribute("departementView", departementController);

        return "EditDepartement";
    }

    @RequestMapping("/updateDepartement")
    public String updateDepartement(@ModelAttribute("departementVue") Departement departementController, ModelMap modelMap) {
        departementService.updatedepartement(departementController);
        return "CreateDepartement";
    }
}

