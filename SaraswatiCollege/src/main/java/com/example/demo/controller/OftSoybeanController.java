package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.OftSoybean;
import com.example.demo.service.OftSoybeanService;

@Controller
public class OftSoybeanController {

    @Autowired
    private OftSoybeanService service;

    @GetMapping("/add-soybean")
    public String showAddForm(Model model) {
        model.addAttribute("soybean", new OftSoybean());
        return "add_soybean";
    }

    @PostMapping("/save-soybean")
    public String saveSoybean(@ModelAttribute OftSoybean soybean) {
        
        return service.save(soybean);
    }

    @GetMapping("/view-all-soybean")
    public String viewAll(Model model) {
        model.addAttribute("list", service.getAll());
        return "soybean_list";
    }

    @GetMapping("/view-by-employee")
    public String viewByEmployee(@RequestParam Long employeeId, Model model) {
        List<OftSoybean> list = service.getByEmployeeId(employeeId);
        model.addAttribute("list", list);
        return "soybean_list";
    }
}
