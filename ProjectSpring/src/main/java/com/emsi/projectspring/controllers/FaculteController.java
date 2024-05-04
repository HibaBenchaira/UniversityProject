package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Faculte;
import com.emsi.projectspring.services.FaculteService;
import lombok.AllArgsConstructor;
import org.springframework.ui.ModelMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class FaculteController {
    private FaculteService faculteService;

    @RequestMapping("/createFaculte")
    public String createFaculte() {
        return "CreateFaculte";
    }

    @RequestMapping("/saveFaculte")
    public String saveFaculte(@ModelAttribute("faculteVue") Faculte faculteController) {
        Faculte saveFaculte = faculteService.saveFaculte(faculteController);
        return "CreateFaculte";
    }

    @RequestMapping("/facultiesList")
    public String facultiesList(ModelMap modelMap) {
        List<Faculte> facultiesController = faculteService.getAllFacultes();
        modelMap.addAttribute("facultiesVue", facultiesController);
        return "facultiesList";
    }
    @RequestMapping("/deleteFaculte")
    public String deleteFaculte(@RequestParam("id") Long id, ModelMap modelMap) {
        faculteService.deleteFaculteById(id);
        return facultiesList(modelMap);
    }

    @RequestMapping("/editFaculte")
    public String editFaculte(@RequestParam("id") Long id, ModelMap modelMap) {
        Faculte faculteController = faculteService.getFaculteById(id);
        modelMap.addAttribute("faculteView", faculteController);
        return "EditFaculte";
    }

    @RequestMapping("/updateFaculte")
    public String updateFaculte(@ModelAttribute("faculteVue") Faculte faculteController) {
        faculteService.updateFaculte(faculteController);
        return createFaculte();
    }

}