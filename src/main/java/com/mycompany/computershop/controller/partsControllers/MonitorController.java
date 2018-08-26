package com.mycompany.computershop.controller.partsControllers;

import com.mycompany.computershop.model.parts.Monitor;
import com.mycompany.computershop.services.ManufacturerService;
import com.mycompany.computershop.services.partsServices.MonitorService;
import com.mycompany.computershop.services.partsServices.MonitorTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("parts")
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @Autowired
    private MonitorTypeService monitorTypeService;

    @Autowired
    private ManufacturerService manufacturerService;

    @RequestMapping(value = "/monitors")
    public String getMonitors(Model model){
        model.addAttribute("title", "Monitors");
        model.addAttribute("monitors", monitorService.findAll());
        return "partsTemplates/monitorTemplates/monitors";
    }

    @RequestMapping(value = "/removeMonitor/{id}", method = RequestMethod.GET)
    public String removeMonitor(@PathVariable(name = "id") int id){
        monitorService.delete(id);

        return "redirect:/parts/monitors";
    }

    @RequestMapping(value = "/editMonitor/{id}", method = RequestMethod.GET)
    public String getMonitorEditForm(Model model,
                                 @PathVariable("id") int id){
        model.addAttribute("title", "Edit Monitor");
        model.addAttribute("monitor", monitorService.findById(id));
        model.addAttribute("manufacturers", manufacturerService.findAll());
        model.addAttribute("monitorTypes", monitorTypeService.findAll());

        return "partsTemplates/monitorTemplates/editMonitor";
    }

    @RequestMapping(value = "/editMonitor", method = RequestMethod.POST)
    public String getEditMonitorForm(@ModelAttribute("hdd") Monitor monitor){
        monitorService.save(monitor);
        return "redirect:/parts/monitors";
    }

    @RequestMapping(value = "/addNewMonitor", method = RequestMethod.GET)
    public String getAddNewMonitor(Model model){
        model.addAttribute("title", "Add new Monitor");
        model.addAttribute(new Monitor());
        model.addAttribute("manufacturers", manufacturerService.findAll());
        model.addAttribute("monitorTypes", monitorTypeService.findAll());
        return "partsTemplates/monitorTemplates/addNewMonitor";
    }

    @RequestMapping(value = "/addNewMonitor", method = RequestMethod.POST)
    public String saveNewMonitor(@ModelAttribute("hdd") Monitor monitor){
        monitorService.save(monitor);

        return "redirect:/parts/monitors";
    }

    @RequestMapping(value = "/monitorInfoPage/{id}", method = RequestMethod.GET)
    public String getMonitorInfoPage(Model model,
                                     @PathVariable("id")int id){
        model.addAttribute("title", "Monitor info page");
        model.addAttribute("monitor", monitorService.findById(id));
        return "partsTemplates/monitorTemplates/monitorInfoPage";
    }

}
