package com.example.demo.controller;

// FLDTurmericController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.FLDTurmeric;
import com.example.demo.service.FLDTurmericService;

@Controller
@RequestMapping("/turmeric")
public class FLDTurmericController {

    private final FLDTurmericService service;

    public FLDTurmericController(FLDTurmericService service) {
        this.service = service;
    }

    @GetMapping("/turmeric-fld")
    public String viewTurmericData(Model model) {
        model.addAttribute("fldData", service.getAllData());
        return "fld-turmeric";
    }

    @GetMapping("/add-turmeric")
    public String showAddForm(Model model) {
        model.addAttribute("fldTurmeric", new FLDTurmeric());
        return "add-turmeric";
    }

    @PostMapping("/save")
    public String saveTurmericData(@ModelAttribute FLDTurmeric fldTurmeric) {
        service.saveData(fldTurmeric);
        return "redirect:/turmeric-fld";
    }
}
