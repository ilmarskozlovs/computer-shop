package com.mycompany.computershop.controller;

import com.mycompany.computershop.model.Computer;
import com.mycompany.computershop.model.parts.*;
import com.mycompany.computershop.services.ComputerService;
import com.mycompany.computershop.services.partsServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class AddComputerController {

    @Autowired
    private ComputerService computerService;
    @Autowired
    private ComputerCaseService computerCaseService;
    @Autowired
    private ComputerTypeService computerTypeService;
    @Autowired
    private CpuService cpuService;
    @Autowired
    private HddService hddService;
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private MotherBoardService motherBoardService;
    @Autowired
    private PowerBlockService powerBlockService;
    @Autowired
    private RamService ramService;
    @Autowired
    private VgaService vgaService;

    @RequestMapping(value = "addComputer")
    public String displayAddComputerForm(Model model){
        model.addAttribute("title", "Pc configurator");
        model.addAttribute(new Computer());
        model.addAttribute("computerTypes", computerTypeService.findAll());
        model.addAttribute("computerCases", computerCaseService.findAll());
        model.addAttribute("cpus", cpuService.findAll());
        model.addAttribute("hdds", hddService.findAll());
        model.addAttribute("monitors", monitorService.findAll());
        model.addAttribute("motherboards", motherBoardService.findAll());
        model.addAttribute("powerblocks", powerBlockService.findAll());
        model.addAttribute("rams", ramService.findAll());
        model.addAttribute("vgas", vgaService.findAll());
        return "addComputer";
    }

    @RequestMapping(value = "addComputer", method = RequestMethod.POST)
    public String processAddComputerForm(@ModelAttribute @Valid Computer computer,
                                         Errors errors, Model model,
                                         @RequestParam int computerTypeId,
                                         @RequestParam int computerCaseId,
                                         @RequestParam int cpuId,
                                         @RequestParam int hddId,
                                         @RequestParam int monitorId,
                                         @RequestParam int motherBoardId,
                                         @RequestParam int powerBlockId,
                                         @RequestParam int ramId,
                                         @RequestParam int vgaId){

        if (errors.hasErrors()){
            model.addAttribute("title", "Add computer");
            model.addAttribute("computerTypes", computerTypeService.findAll());
            model.addAttribute("computerCases", computerCaseService.findAll());
            model.addAttribute("cpus", cpuService.findAll());
            model.addAttribute("hdds", hddService.findAll());
            model.addAttribute("monitors", monitorService.findAll());
            model.addAttribute("motherboards", motherBoardService.findAll());
            model.addAttribute("powerblocks", powerBlockService.findAll());
            model.addAttribute("rams", ramService.findAll());
            model.addAttribute("vgas", vgaService.findAll());
            return "addComputer";
        }

        ComputerType computerType = computerTypeService.findById(computerTypeId);
        ComputerCase computerCase = computerCaseService.findById(computerCaseId);
        Cpu cpu = cpuService.findById(cpuId);
        Hdd hdd = hddService.findById(hddId);
        Monitor monitor = monitorService.findById(monitorId);
        MotherBoard motherBoard = motherBoardService.findById(motherBoardId);
        PowerBlock powerBlock = powerBlockService.findById(powerBlockId);
        Ram ram = ramService.findById(ramId);
        Vga vga = vgaService.findById(vgaId);

        computer.setComputerType(computerType);
        computer.setComputerCase(computerCase);
        computer.setCpu(cpu);
        computer.setHdd(hdd);
        computer.setMonitor(monitor);
        computer.setMotherBoard(motherBoard);
        computer.setPowerBlock(powerBlock);
        computer.setRam(ram);
        computer.setVga(vga);

        computerService.save(computer);

        return "redirect:main";
    }
}
