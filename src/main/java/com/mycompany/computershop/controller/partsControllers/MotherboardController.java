package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.MotherBoard;
import com.mycompany.computershop.services.partsServices.MotherBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class MotherboardController {

    @Autowired
    private MotherBoardService motherBoardService;

    @RequestMapping(value = "/motherboards")
    public String getMotherboards(Model model){
        model.addAttribute("title", "Motherboards");
        model.addAttribute("motherboards", motherBoardService.findAll());
        return "partsTemplates/motherboards";
    }

    @RequestMapping(value = "/removeMotherboard/{id}", method = RequestMethod.GET)
    public String removeMotherboard(@PathVariable(name = "id") int id){
        motherBoardService.delete(id);

        return "redirect:/parts/motherboards";
    }

    @RequestMapping(value = "/editMotherboard/{id}", method = RequestMethod.GET)
    public String getMotherboardsEditForm(Model model,
                                     @PathVariable("id") int id){
        model.addAttribute("title", "Edit Motherboard");
        model.addAttribute("motherboard", motherBoardService.findById(id));

        return "partsTemplates/editMotherboard";
    }

    @RequestMapping(value = "/editMotherboard", method = RequestMethod.POST)
    public String getEditMotherboardForm(@ModelAttribute("motherboard") MotherBoard motherBoard){
        motherBoardService.save(motherBoard);
        return "redirect:/parts/motherboards";
    }

    @RequestMapping(value = "/addNewMotherboard", method = RequestMethod.GET)
    public String getAddNewMotherboard(Model model){
        model.addAttribute("title", "Add new Motherboard");
        model.addAttribute(new MotherBoard());
        return "partsTemplates/addNewMotherboard";
    }

    @RequestMapping(value = "/addNewMotherboard", method = RequestMethod.POST)
    public String saveNewMotherboard(@ModelAttribute("motherboard") MotherBoard motherBoard){
        motherBoardService.save(motherBoard);

        return "redirect:/parts/motherboards";
    }

}
