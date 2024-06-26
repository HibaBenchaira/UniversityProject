package com.emsi.projectspring.controllers;


import com.emsi.projectspring.entities.Compte;
import com.emsi.projectspring.entities.Personnel;
import com.emsi.projectspring.services.CompteService;
import com.emsi.projectspring.services.PersonnelService;

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
public class PersonnelController {
    private PersonnelService personnelService;
    private CompteService  compteService;
    @RequestMapping("/createPersonnel")
    public String createPersonnel() {
        List<Compte> comptes= compteService.getAllComptes();
        return "CreatePersonnel";
    }
    @RequestMapping("savePersonnel")
    public String savePersonnel(@Valid Personnel personnelController, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "CreatePersonnel";
        Personnel savedPersonnel = personnelService.savePersonnel(personnelController);
        return "CreatePersonnel";
    }
    @RequestMapping("/personnelsList")
    public String personnelsList(ModelMap modelMap) {
        List <Personnel> personnelsController = personnelService.getAllPersonnels();
        modelMap.addAttribute("personnelsVue", personnelsController);
        return "personnelsList";
    }
    @RequestMapping("/deletePersonnel")
    public String deletePersonnel(@RequestParam("id")Long id, ModelMap modelMap) {
        personnelService.deletePersonnelById(id);
        return personnelsList(modelMap);
    }
    @RequestMapping("/editPersonnel")
    public String editPersonnel(@RequestParam("id")Long id,ModelMap modelMap){
        Personnel personnelController = personnelService.getPersonnelById(id);
        modelMap.addAttribute("personnelView",personnelController);
        return "EditPersonnel";
    }
    @RequestMapping("/updatePersonnel")
    public String updatePeronnel(@ModelAttribute ("personnelVue") Personnel personnelController){
        personnelService.updatePersonnel(personnelController);
        return "CreatePersonnel";
    }
}
