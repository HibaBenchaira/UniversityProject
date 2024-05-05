package com.emsi.projectspring.controllers;

import com.emsi.projectspring.entities.FonctionEmployee;
import com.emsi.projectspring.services.FonctionEmployeeService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class FonctionEmployeeController {
    private FonctionEmployeeService fonctionEmployeeService;

    @RequestMapping("/createFonctionEmployee")
    public String createFonctionEmployee() {
        return "CreateFonctionEmployee";
    }

    @RequestMapping("saveFonctionEmployee")
    public String saveFonctionEmployee(@ModelAttribute("fonctionEmployeeVue") FonctionEmployee fonctionEmployeeController) {
        FonctionEmployee savedFonctionEmployee = fonctionEmployeeService.saveFonctionEmployee(fonctionEmployeeController);
        return "CreateFonctionEmployee";
    }

    @RequestMapping("/fonctionEmployeesList")
    public String fonctionEmployeesList(ModelMap modelMap) {
        List<FonctionEmployee> fonctionEmployeesController = fonctionEmployeeService.getAllFonctionEmployees();
        modelMap.addAttribute("fonctionEmployeesVue", fonctionEmployeesController);
        return "fonctionEmployeesList";
    }

    @RequestMapping("/deleteFonctionEmployee")
    public String deleteFonctionEmployee(@RequestParam("id") Long id, ModelMap modelMap) {
        fonctionEmployeeService.deleteFonctionEmployeeById(id);
        return fonctionEmployeesList(modelMap);
    }

    @RequestMapping("/editFonctionEmployee")
    public String editFonctionEmployee(@RequestParam("id") Long id, ModelMap modelMap) {
        FonctionEmployee fonctionEmployeeController = fonctionEmployeeService.getFonctionEmployeeById(id);
        modelMap.addAttribute("fonctionEmployeeView", fonctionEmployeeController);
        return "EditFonctionEmployee";
    }

    @RequestMapping("/updateFonctionEmployee")
    public String updateFonctionEmployee(@ModelAttribute("fonctionEmployeeVue") FonctionEmployee fonctionEmployeeController) {
        fonctionEmployeeService.updateFonctionEmployee(fonctionEmployeeController);
        return createFonctionEmployee();
    }
}
