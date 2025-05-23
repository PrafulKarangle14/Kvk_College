package com.example.demo.controller;

import com.example.demo.entity.FldOnion;
import com.example.demo.service.FldOnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/fldonion")
public class FldOnionController {

    @Autowired
    private FldOnionService service;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("fldOnion", new FldOnion());
        return "fldonion_form";
    }

    @PostMapping("/save")
    public String saveData(@ModelAttribute FldOnion fldOnion) {
        service.save(fldOnion);
        return service.save(fldOnion);
    }

    @GetMapping("/list")
    public String listAll(Model model) {
        model.addAttribute("fldList", service.getAll());
        return "fldonion_list";
    }

    @GetMapping("/view/{id}")
    public String viewById(@PathVariable Long id, Model model) {
        Optional<FldOnion> data = service.getById(id);
        model.addAttribute("fldOnion", data.orElse(null));
        return "fldonion_view";
    }
}
