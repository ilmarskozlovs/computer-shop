package com.mycompany.computershop.controller;

import com.mycompany.computershop.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RemoveComputerController {

    @Autowired
    private ComputerService computerService;

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String getRemoveComputerForm(Model model){
        model.addAttribute("title", "Remove Computer from database");
        model.addAttribute("computers", computerService.findAll());

        return "removeComputer";
    }

    @RequestMapping(value = "remove", method = RequestMethod.POST)
    public String processRemoveComputerForm(@RequestParam int [] computerIds){
        for (int computerId : computerIds){
            computerService.remove(computerId);
        }
        return "redirect:main";
    }


}
