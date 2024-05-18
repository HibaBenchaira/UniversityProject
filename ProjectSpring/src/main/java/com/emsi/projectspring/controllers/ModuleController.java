package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Filiere;
import com.emsi.projectspring.entities.Module;
import com.emsi.projectspring.services.FiliereService;
import com.emsi.projectspring.services.ModuleService;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class ModuleController {
    private ModuleService moduleService;
    private FiliereService filiereService;
    @RequestMapping("/createModule")
    public String createModule(ModelMap modelMap) {
        List <Filiere> filieres = filiereService.getAllFilieres();
        modelMap.addAttribute("filieres", filieres);
        return "CreateModule";
    }
    @RequestMapping("saveModule")
    public String saveModule(@ModelAttribute ("moduleVue") Module moduleController) {
        Module savedModule= moduleService.saveModule(moduleController);
        return "CreateModule";
    }
    @RequestMapping("/modulesList")
    public String modulesList(ModelMap modelMap) {
        List <Module> modulesController = moduleService.getAllModules();
        modelMap.addAttribute("modulesVue", modulesController);
        return "modulesList";
    }
    @RequestMapping("/deleteModule")
    public String deleteModule(@RequestParam("id")Long id, ModelMap modelMap) {
        moduleService.deleteModuleById(id);
        return modulesList(modelMap);
    }
    /*@RequestMapping("/editModule")
    public String editModule(@RequestParam("id")Long id,ModelMap modelMap){
        Module moduleController = moduleService.getModuleById(id);
        modelMap.addAttribute("moduleView",moduleController);
        return "EditModule";
    }*/
    @RequestMapping("/updateModule")
    public String updateModule(@ModelAttribute ("moduleVue") Module moduleController){
        moduleService.updateModule(moduleController);
        return "CreateModule";
    }
}
