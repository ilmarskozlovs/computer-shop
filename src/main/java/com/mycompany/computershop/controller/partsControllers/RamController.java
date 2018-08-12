package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.Ram;
import com.mycompany.computershop.services.partsServices.RamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class RamController {

    @Autowired
    private RamService ramService;

    @RequestMapping(value = "/ram")
    public String getRam(Model model){
        model.addAttribute("title", "Random Access Memory (RAM)");
        model.addAttribute("rams", ramService.findAll());
        return "partsTemplates/ram";
    }

    @RequestMapping(value = "/removeRam/{id}", method = RequestMethod.GET)
    public String removeRam(@PathVariable ("id")int id){
        ramService.delete(id);
        return "redirect:/parts/ram";
    }

    @RequestMapping(value = "/editRam/{id}", method = RequestMethod.GET)
    public String getRamEditForm(Model model,
                                        @PathVariable("id") int id){
        model.addAttribute("title", "Edit Ram");
        model.addAttribute("ram", ramService.findById(id));

        return "partsTemplates/editRam";
    }

    @RequestMapping(value = "/editRam", method = RequestMethod.POST)
    public String getEditRamForm(@ModelAttribute("ram") Ram ram){
        ramService.save(ram);
        return "redirect:/parts/ram";
    }

    @RequestMapping(value = "/addNewRam", method = RequestMethod.GET)
    public String getAddNewRam(Model model){
        model.addAttribute("title", "Add new Ram");
        model.addAttribute(new Ram());
        return "partsTemplates/addNewRam";
    }

    @RequestMapping(value = "/addNewRam", method = RequestMethod.POST)
    public String saveNewRam(@ModelAttribute("ram") Ram ram){
        ramService.save(ram);

        return "redirect:/parts/ram";
    }
}
