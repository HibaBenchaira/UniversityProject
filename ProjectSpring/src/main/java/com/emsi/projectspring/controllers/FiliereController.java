package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Filiere;
import com.emsi.projectspring.entities.Module;
import com.emsi.projectspring.entities.Salle;
import com.emsi.projectspring.services.FiliereService;
import com.emsi.projectspring.services.ModuleService;
import com.emsi.projectspring.services.SalleService;
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
public class FiliereController {

    private FiliereService filiereService;
    private SalleService salleService;
    @RequestMapping("/createFiliere")
    public String createFiliere(ModelMap modelMap){
        List <Salle> salles = salleService.getAllSalles();
        modelMap.addAttribute("salles", salles);
        return"CreateFiliere";
    }
    @RequestMapping("/saveFiliere")
    public String saveFiliere(@Valid Filiere filiereController){

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
        Salle  salleController   = salleService.getSalleById(id);
        modelMap.addAttribute("salleView",salleController);


        return "EditFiliere";
    }@RequestMapping("/updateFiliere")
    public String updateFiliere(@ModelAttribute ("filiereVue") Filiere filiereController){
        filiereService.updateFiliere(filiereController);
        return createFiliere();
    }


}



