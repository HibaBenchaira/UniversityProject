package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Filiere;
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
public class FiliereController {

    private FiliereService filiereService;
    @RequestMapping("/createFiliere")
    public String createFiliere(){
        return"CreateFiliere";
    }
    @RequestMapping("/saveFiliere")
    public String saveFiliere(@ModelAttribute("filiereVue") Filiere filiereController){
        Filiere saveFiliere = filiereService.saveFiliere(filiereController);
        return "CreateFiliere";
    }
    @RequestMapping("/filieresList")
    public String filieresList(ModelMap modelMap){
        List<Filiere > filieresController= filiereService.getAllFilieres();
        modelMap.addAttribute("filieresVue",filieresController);
        return "filieresList";

    }
    @RequestMapping("/deleteFiliere")
    public String deleteFiliere(@RequestParam("id")Long id, ModelMap modelMap){
        filiereService.deleteFiliereById(id);
        return  filieresList(modelMap);

    }
    @RequestMapping("/editFiliere")
    public String editFiliere(@RequestParam("id")Long id,ModelMap modelMap){
        Filiere filiereController = filiereService.getFiliereById(id);
        modelMap.addAttribute("filiereView",filiereController);
        return "EditFiliere";
    }@RequestMapping("/updateFiliere")
    public String updateFiliere(@ModelAttribute ("filiereVue") Filiere filiereController){
        filiereService.updateFiliere(filiereController);
        return createFiliere();
    }


}



