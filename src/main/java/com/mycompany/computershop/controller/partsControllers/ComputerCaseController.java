package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.ComputerCase;
import com.mycompany.computershop.services.partsServices.ComputerCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/parts")
public class ComputerCaseController {

    @Autowired
    private ComputerCaseService computerCaseService;

    @RequestMapping("/computerCases")
    public String getComputerCases(Model model){
        model.addAttribute("title", "Computer cases");
        model.addAttribute("computerCases", computerCaseService.findAll());
        return "partsTemplates/computerCase";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeComputerCase(@PathVariable(name = "id") int id){
        computerCaseService.delete(id);

        return "redirect:/parts/computerCases";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getComputerCaseEditForm(Model model,
                                          @PathVariable("id") int id){
        model.addAttribute("title", "Edit Computer case");
        model.addAttribute("computerCase", computerCaseService.findById(id));

        return "partsTemplates/editComputerCase";
    }

    @RequestMapping(value = "/editCase", method = RequestMethod.POST)
    public String getEditComputerCaseForm(@ModelAttribute ("computerCase") ComputerCase computerCase){
        computerCaseService.save(computerCase);
        return "redirect:/parts/computerCases";
    }

    @RequestMapping(value = "/addNewCase", method = RequestMethod.GET)
    public String getAddNewComputerCaseForm(Model model){
        model.addAttribute("title", "Add new Computer case");
        model.addAttribute(new ComputerCase());
        return "partsTemplates/addNewComputerCase";
    }

    @RequestMapping(value = "/addNewCase", method = RequestMethod.POST)
    public String saveNewComputerCase(@ModelAttribute("computerCase") ComputerCase computerCase){
        computerCaseService.save(computerCase);

        return "redirect:/parts/computerCases";
    }
}
