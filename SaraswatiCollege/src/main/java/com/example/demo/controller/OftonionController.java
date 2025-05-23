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

import com.example.demo.entity.Oftonion;
import com.example.demo.service.OftonionService;

@Controller
@RequestMapping("/oftonion")
public class OftonionController {

    @Autowired
    private OftonionService service;

    @GetMapping("/add-oftonion")
    public String showAddForm(Model model) {
        model.addAttribute("oftonion", new Oftonion());
        return "add_oftonion";
    }

    @PostMapping("/save")
    public String saveOftonion(@ModelAttribute Oftonion oftonion) {
        
        return service.saveOftonion(oftonion); 
    }

    @GetMapping("/oftonion-list")
    public String viewAll(Model model) {
        List<Oftonion> list = service.getAll();
        model.addAttribute("oftonions", list);
        return "oftonion_list";
    }

    @GetMapping("/oftonion-by-name")
    public String getByName(@RequestParam String name, Model model) {
        service.getByName(name).ifPresent(o -> model.addAttribute("oftonion", o));
        return "oftonion_by_name";
    }
}
