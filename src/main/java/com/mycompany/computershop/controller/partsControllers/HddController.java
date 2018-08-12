package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.Hdd;
import com.mycompany.computershop.services.partsServices.HddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class HddController {

    @Autowired
    private HddService hddService;

    @RequestMapping("/hdd")
    public String getHdd(Model model){
        model.addAttribute("title", "Hard disk drives");
        model.addAttribute("hdds", hddService.findAll());
        return "partsTemplates/hdd";
    }


    @RequestMapping(value = "/removeHdd/{id}", method = RequestMethod.GET)
    public String removeHdd(@PathVariable(name = "id") int id){
        hddService.delete(id);

        return "redirect:/parts/hdd";
    }

    @RequestMapping(value = "/editHdd/{id}", method = RequestMethod.GET)
    public String getHddEditForm(Model model,
                                 @PathVariable("id") int id){
        model.addAttribute("title", "Edit Hdd");
        model.addAttribute("hdd", hddService.findById(id));

        return "partsTemplates/editHdd";
    }

    @RequestMapping(value = "/editHdd", method = RequestMethod.POST)
    public String getEditHdd(@ModelAttribute("hdd") Hdd hdd){
        hddService.save(hdd);
        return "redirect:/parts/hdd";
    }

    @RequestMapping(value = "/addNewHdd", method = RequestMethod.GET)
    public String getAddNewHdd(Model model){
        model.addAttribute("title", "Add new Hard disk drive");
        model.addAttribute(new Hdd());
        return "partsTemplates/addNewHdd";
    }

    @RequestMapping(value = "/addNewHdd", method = RequestMethod.POST)
    public String saveNewHdd(@ModelAttribute("hdd") Hdd hdd){
        hddService.save(hdd);

        return "redirect:/parts/hdd";
    }
}
