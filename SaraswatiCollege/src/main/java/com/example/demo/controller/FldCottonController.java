package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.FldCotton;
import com.example.demo.service.FldCottonService;

@Controller
@RequestMapping("/fldCotton")
public class FldCottonController {

    @Autowired
    private FldCottonService service;

    // Load form to add cotton data
    @GetMapping("/fldCotton/form")
    public String showForm(Model model) {
        model.addAttribute("cotton", new FldCotton());
        return "dashcontain/cottonForm"; // cottonForm.html
    }

    // Save cotton data
    @PostMapping("/save")
    public String  saveCotton(@ModelAttribute FldCotton cotton) {
        
        return service.save(cotton);
    }

    // List all cotton entries
    @GetMapping("/fldCotton/list")
    public String listCotton(Model model) {
        List<FldCotton> list = service.getAllCotton();
        model.addAttribute("cottonList", list);
        return "dashcontain/cottonList"; // cottonList.html
    }

    // View specific cotton data
    @GetMapping("/fldCotton/view/{id}")
    public String viewCotton(@PathVariable Long id, Model model) {
        service.getCottonById(id).ifPresent(cotton -> model.addAttribute("cotton", cotton));
        return "dashcontain/viewCotton"; // viewCotton.html
    }

    // Delete cotton by ID
    @GetMapping("/fldCotton/delete/{id}")
    public String deleteCotton(@PathVariable Long id) {
        service.deleteCottonById(id);
        return "redirect:/fldCotton/list";
    }
}
