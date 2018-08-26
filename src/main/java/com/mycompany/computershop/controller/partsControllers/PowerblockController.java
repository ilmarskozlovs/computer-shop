package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.PowerBlock;
import com.mycompany.computershop.services.partsServices.PowerBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class PowerblockController {

    @Autowired
    private PowerBlockService powerBlockService;

    @RequestMapping(value = "/powerblocks")
    public String getPowerBlocks(Model model){
        model.addAttribute("title", "Powerblocks");
        model.addAttribute("powerblocks", powerBlockService.findAll());
        return "partsTemplates/powerblockTemplates/powerblocks";
    }


    @RequestMapping(value = "/removePowerblock/{id}", method = RequestMethod.GET)
    public String removePowerblock(@PathVariable(name = "id") int id){
        powerBlockService.delete(id);

        return "redirect:/parts/powerblocks";
    }

    @RequestMapping(value = "/editPowerblock/{id}", method = RequestMethod.GET)
    public String getPowerblockEditForm(Model model,
                                          @PathVariable("id") int id){
        model.addAttribute("title", "Edit Powerblock");
        model.addAttribute("powerBlock", powerBlockService.findById(id));

        return "partsTemplates/powerblockTemplates/editPowerblock";
    }

    @RequestMapping(value = "/editPowerblock", method = RequestMethod.POST)
    public String getEditPowerblockForm(@ModelAttribute("powerblock") PowerBlock powerBlock){
        powerBlockService.save(powerBlock);
        return "redirect:/parts/powerblocks";
    }

    @RequestMapping(value = "/addNewPowerblock", method = RequestMethod.GET)
    public String getAddNewPowerblock(Model model){
        model.addAttribute("title", "Add new Powerblock");
        model.addAttribute(new PowerBlock());
        return "partsTemplates/powerblockTemplates/addNewPowerblock";
    }

    @RequestMapping(value = "/addNewPowerblock", method = RequestMethod.POST)
    public String saveNewPowerblock(@ModelAttribute("powerblock") PowerBlock powerBlock){
        powerBlockService.save(powerBlock);

        return "redirect:/parts/powerblocks";
    }

    @RequestMapping(value = "/powerblockInfoPage/{id}", method = RequestMethod.GET)
    public String getPowerblockInfoPage(Model model,
                                         @PathVariable("id")int id){
        model.addAttribute("title", "Powerblock info page");
        model.addAttribute("powerblock", powerBlockService.findById(id));
        return "partsTemplates/powerblockTemplates/powerblockInfoPage";
    }
}
