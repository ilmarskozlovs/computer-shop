package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.Cpu;
import com.mycompany.computershop.services.ManufacturerService;
import com.mycompany.computershop.services.partsServices.CpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class CpuController {

    @Autowired
    private CpuService cpuService;

    @Autowired
    private ManufacturerService manufacturerService;

    @RequestMapping(value = "/cpu")
    public String getCpus(Model model){
        model.addAttribute("title", "Central processing units ");
        model.addAttribute("cpus", cpuService.findAll());
        return "partsTemplates/cpuTemplates/cpu";
    }

    @RequestMapping(value = "/removeCpu/{id}", method = RequestMethod.GET)
    public String removeCpu(@PathVariable(name = "id") int id){
        cpuService.delete(id);

        return "redirect:/parts/cpu";
    }

    @RequestMapping(value = "/editCpu/{id}", method = RequestMethod.GET)
    public String getCpuEditForm(Model model,
                                          @PathVariable("id") int id){
        model.addAttribute("title", "Edit Cpu");
        model.addAttribute("cpu", cpuService.findById(id));
        model.addAttribute("manufacturers", manufacturerService.findAll());

        return "partsTemplates/cpuTemplates/editCpu";
    }

    @RequestMapping(value = "/editCpu", method = RequestMethod.POST)
    public String getEditCpu(@ModelAttribute("cpu") Cpu cpu){
        cpuService.save(cpu);
        return "redirect:/parts/cpu";
    }

    @RequestMapping(value = "/addNewCpu", method = RequestMethod.GET)
    public String getAddNewCpu(Model model){
        model.addAttribute("title", "Add new Central processor unit");
        model.addAttribute(new Cpu());
        model.addAttribute("manufacturers", manufacturerService.findAll());
        return "partsTemplates/cpuTemplates/addNewCpu";
    }

    @RequestMapping(value = "/addNewCpu", method = RequestMethod.POST)
    public String saveNewCpu(@ModelAttribute("cpu") Cpu cpu){
        cpuService.save(cpu);

        return "redirect:/parts/cpu";
    }

    @RequestMapping(value = "/cpuInfoPage/{id}", method = RequestMethod.GET)
    public String getCpuInfoPage(Model model,
                                 @PathVariable("id") int id){
        model.addAttribute("title", "Central processor unit info page");
        model.addAttribute("cpu", cpuService.findById(id));
        return "partsTemplates/cpuTemplates/cpuInfoPage";
    }
}
