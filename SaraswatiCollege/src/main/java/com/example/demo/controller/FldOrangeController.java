package com.example.demo.controller;

import com.example.demo.entity.FldOrange;
import com.example.demo.service.FldOrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fldorange")
public class FldOrangeController {

    @Autowired
    private FldOrangeService service;

    // Show form to add Orange FLD data
    @GetMapping("/admin/add-orange")
    public String showForm(Model model) {
        model.addAttribute("fldOrange", new FldOrange());
        return "add_orange_form";
    }

    // Handle form submission
    @PostMapping("/save")
    public String saveOrange(@ModelAttribute FldOrange fldOrange) {
        
        return service.save(fldOrange);
    }

    // Show all Orange FLD data in a table
    @GetMapping("/admin/orange-data")
    public String viewOrangeData(Model model) {
        model.addAttribute("orangeList", service.getAll());
        return "orange_data_table";
    }
}
