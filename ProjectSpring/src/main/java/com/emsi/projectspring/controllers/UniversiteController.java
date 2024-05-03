package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Personnel;
import com.emsi.projectspring.entities.Universite;
import com.emsi.projectspring.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class UniversiteController {
    private UniversiteService universiteService;
    @RequestMapping("/createUniversite")
    public String createUniversite(){
        return"CreateUniversite";
    }
    @RequestMapping("/saveUniversite")
    public String saveUniversite(@ModelAttribute("universiteVue")Universite universiteController){
       Universite saveUniversity = universiteService.saveUniversite(universiteController);
       return "CreateUniversite";
    }
    @RequestMapping("/universitiesList")
        public String universitiesList(ModelMap modelMap){
        List <Universite > universitesController= universiteService.getAllUniversites();
        modelMap.addAttribute("universitiesVue",universitesController);
        return "universitiesList";

    }
    @RequestMapping("/deleteUniversite")
    public String deleteUniversite(@RequestParam("id")Long id,ModelMap modelMap){
        universiteService.deleteUniversiteById(id);
        return  universitiesList(modelMap);

    }
    @RequestMapping("/editUniversite")
    public String editUniversite(@RequestParam("id")Long id,ModelMap modelMap){
        Universite universiteController = universiteService.getUniversiteById(id);
        modelMap.addAttribute("universiteView",universiteController);
        return "EditUniversite";
    }@RequestMapping("/updateUniversite")
    public String updateUniversite(@ModelAttribute ("universiteVue") Universite universiteController){
        universiteService.updateUniversite(universiteController);
        return createUniversite();
    }


}


