package com.example.demo.controller;

import com.example.demo.entity.FldSoyabean;
import com.example.demo.service.FldSoyabeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/soyabean")
public class FldSoyabeanController {

    @Autowired
    private FldSoyabeanService soyabeanService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("soyabean", new FldSoyabean());
        return "soyabean-form";
    }

    @PostMapping("/save")
    public String saveSoyabean(@ModelAttribute FldSoyabean soyabean) {
        
        return soyabeanService.saveSoyabean(soyabean);
    }

    @GetMapping("/list")
    public String viewAllData(Model model) {
        List<FldSoyabean> dataList = soyabeanService.getAllSoyabeanData();
        model.addAttribute("soyabeanList", dataList);
        return "soyabean-list";
    }
}
