package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.Vga;
import com.mycompany.computershop.services.ManufacturerService;
import com.mycompany.computershop.services.partsServices.MemorySizeService;
import com.mycompany.computershop.services.partsServices.VgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class VgaController {

    @Autowired
    private VgaService vgaService;

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private MemorySizeService memorySizeService;

    @RequestMapping("/vga")
    public String getVgas(Model model){
        model.addAttribute("title", "Video cards(VGA)");
        model.addAttribute("vgas", vgaService.findAll());
        return "partsTemplates/vgaTemplates/vga";
    }
    @RequestMapping(value = "/removeVga/{id}", method = RequestMethod.GET)
    public String removeVga(@PathVariable("id")int id){
        vgaService.delete(id);
        return "redirect:/parts/vga";
    }

    @RequestMapping(value = "/editVga/{id}", method = RequestMethod.GET)
    public String getVgaEditForm(Model model,
                                 @PathVariable("id") int id){
        model.addAttribute("title", "Edit Vga");
        model.addAttribute("vga", vgaService.findById(id));
        model.addAttribute("manufacturers", manufacturerService.findAll());
        model.addAttribute("memorySizes", memorySizeService.findAll());

        return "partsTemplates/vgaTemplates/editVga";
    }

    @RequestMapping(value = "/editVga", method = RequestMethod.POST)
    public String getEditVgaForm(@ModelAttribute("vga") Vga vga){
         vgaService.save(vga);
        return "redirect:/parts/vga";
    }

    @RequestMapping(value = "/addNewVga", method = RequestMethod.GET)
    public String getAddNewVga(Model model){
        model.addAttribute("title", "Add new Vga");
        model.addAttribute(new Vga());
        model.addAttribute("manufacturers", manufacturerService.findAll());
        model.addAttribute("memorySizes", memorySizeService.findAll());
        return "partsTemplates/vgaTemplates/addNewVga";
    }

    @RequestMapping(value = "/addNewVga", method = RequestMethod.POST)
    public String saveNewVga(@ModelAttribute("vga") Vga vga){
        vgaService.save(vga);

        return "redirect:/parts/vga";
    }

    @RequestMapping(value = "/vgaInfoPage/{id}", method = RequestMethod.GET)
    public String getVgaInfoPage(Model model,
                                 @PathVariable("id")int id){
        model.addAttribute("title", "Video cards info page");
        model.addAttribute("vga", vgaService.findById(id));
        return "partsTemplates/vgaTemplates/vgaInfoPage";
    }
}
