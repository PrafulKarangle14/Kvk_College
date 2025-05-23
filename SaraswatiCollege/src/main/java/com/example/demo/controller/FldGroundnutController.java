package com.example.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.FldGroundnut;
import com.example.demo.service.FldGroundnutService;

@Controller
@RequestMapping("/fld-groundnut")
public class FldGroundnutController {

    @Autowired
    private FldGroundnutService service;

    // Show all data in table format
    @GetMapping("/all")
    public String showAll(Model model) {
        List<FldGroundnut> list = service.getAll();
        model.addAttribute("fldList", list);
        return "fld-groundnut-table";
    }

    // Show data by ID
    @GetMapping("/{id}")
    public String getById(@PathVariable Long id, Model model) {
        Optional<FldGroundnut> data = service.getById(id);
        if (data.isPresent()) {
            model.addAttribute("fld", data.get());
        } else {
            model.addAttribute("error", "No data found with ID: " + id);
        }
        return "fld-groundnut-single";
    }

    // Form to add new data
    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("fld", new FldGroundnut());
        return "fld-groundnut-form";
    }

    // Save submitted data
    @PostMapping("/save")
    public String save(@ModelAttribute FldGroundnut fld) {
        service.save(fld);
        return "redirect:/fld-groundnut/all";
    }
}
