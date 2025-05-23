package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Chickpea;
import com.example.demo.entity.FldSoyabean;
import com.example.demo.service.ChickpeaService;

@Controller
@RequestMapping("/chickpea")
public class ChickpeaController {

    @Autowired
    private ChickpeaService chickpeaService;
    
    @PostMapping("/save")
    public String saveSoyabean(@ModelAttribute Chickpea chickpea ) {
        
        return chickpeaService.save(chickpea);
    }

    @GetMapping("/all")
    public String getAllChickpeas(Model model) {
        List<Chickpea> list = chickpeaService.getAll();
        model.addAttribute("chickpeas", list);
        return "chickpea_table";
    }

    @GetMapping("/byId")
    public String getByIdForm() {
        return "chickpea_search";
    }

    @PostMapping("/byId")
    public String getChickpeaById(@RequestParam Long id, Model model) {
        chickpeaService.getById(id).ifPresent(c -> model.addAttribute("chickpea", c));
        return "chickpea_single";
    }
}
