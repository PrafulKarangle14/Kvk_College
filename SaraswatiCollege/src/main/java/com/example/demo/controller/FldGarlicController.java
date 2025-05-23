package com.example.demo.controller;

import com.example.demo.entity.FldGarlic;
import com.example.demo.service.FldGarlicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FldGarlicController {

    @Autowired
    private FldGarlicService service;

    // Display all garlic data
    @GetMapping("/admin/garlic-data")
    public String viewGarlicData(Model model) {
        model.addAttribute("garlicList", service.getAll());
        return "garlic_data_table";
    }

    // Show form to add garlic data
    @GetMapping("/admin/add-garlic")
    public String showForm(Model model) {
        model.addAttribute("fldGarlic", new FldGarlic());
        return "add_garlic_form";
    }

    // Handle form submission
    @PostMapping("/admin/save-garlic")
    public String saveGarlic(@ModelAttribute FldGarlic fldGarlic) {
        service.save(fldGarlic);
        return "redirect:/admin/garlic-data";
    }
}
