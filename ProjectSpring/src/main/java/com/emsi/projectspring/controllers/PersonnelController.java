package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.Personnel;
import com.emsi.projectspring.services.PersonnelService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class PersonnelController {
    private PersonnelService personnelService;
    @RequestMapping("/createPersonnel")
    public String createPersonnel() {
        return "CreatePersonnel";
    }
    @RequestMapping("savePersonnel")
    public String savePersonnel(@ModelAttribute ("personnelVue") Personnel personnelController) {
        Personnel savedPersonnel = personnelService.savePersonnel(personnelController);
        return "CreatePersonnel";
    }

}
