package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Pigeon;
import com.example.demo.service.PigeonService;

@Controller
@RequestMapping("/admin")
public class PigeonController {

    @Autowired
    private PigeonService pigeonService;

    

    @PostMapping("/save")
    public String savePigeon(@ModelAttribute Pigeon pigeon) {
       
        return  pigeonService.savePigeon(pigeon);
    }

    @GetMapping("/all")
    public String getAllPigeons(Model model) {
        List<Pigeon> pigeonList = pigeonService.getAllPigeons();
        model.addAttribute("pigeons", pigeonList);
        return "pigeon-table";
    }

}
