package com.mycompany.computershop.controller;

import com.mycompany.computershop.services.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private ComputerService computerService;

    @RequestMapping(value = "")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/main")
    public String mainPage(Model model){
        model.addAttribute("title", "Main Page");
        model.addAttribute("computers", computerService.findAll());
        return "mainPage";
    }

    @RequestMapping(value = "addParts")
    public String getAddPartsForm(Model model){
        model.addAttribute("title", "Administrator page");
        return "addParts";
    }
}
