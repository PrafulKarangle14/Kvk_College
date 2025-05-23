package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Value("${admin.username}")
    private String adminUsername;

    @Value("${admin.password}")
    private String adminPassword;

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    // Show Admin Dashboard
    @GetMapping("/dashboard")
    public String showAdminPage() {
        return "admin"; // Load admin.html
    }

    // Show All Users Page
    @GetMapping("/all-users")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "all-users"; // Load all-users.html with user list
    }

    // Search a Specific User by Username
    @PostMapping("/search-user")
    public String searchUser(@RequestParam String searchUsername, Model model) {
        User user = userService.getUserByUsername(searchUsername);
        model.addAttribute("user", user);
        return "user-details"; // Load user-details.html
    }
    @GetMapping("/fld")
    public String showFld() {
        return "dashcontain/fld"; // Load admin.html
    }
    
    @GetMapping("/fldCotten")
    public String showFldcotten() {
        return "dashcontain/Cotton"; // Load admin.html
    }
    
    @GetMapping("/pigeon")
    public String showPigeon() {
        return "dashcontain/pigeon"; // Load admin.html
    }
    
    @GetMapping("/soyabean")
    public String showsoyabean() {
        return "dashcontain/Soybean"; // Load admin.html
    }
    @GetMapping("/chickpea")
    public String showchickpea() {
        return "dashcontain/Chickpea"; // Load admin.html
    }
    @GetMapping("/oftGarlic")
    public String showoftGarlic() {
        return "dashcontain/Chickpea"; // Load admin.html
    }
    @GetMapping("/oftChickpea")
    public String showChickpea() {
        return "dashcontain/Chickpea"; // Load admin.html
    }
    @GetMapping("/oftSoyabean")
    public String showSoyabean() {
        return "dashcontain/Soybean"; // Load admin.html
    }
    @GetMapping("/oftPigeon")
    public String showPigeons() {
        return "dashcontain/pigeon"; // Load admin.html
    }
    @GetMapping("/oftCotten")
    public String showOldcotten() {
        return "dashcontain/Cotton"; // Load admin.html
    }
    
    @GetMapping("/oftTurmeric")
    public String showTurmeric() {
        return "dashcontain/turmeric"; // Load admin.html
    }
    
    
    @GetMapping("/oftOnion")
    public String showOftOnion() {
        return "dashcontain/onion-form"; // Load admin.html
    }
    @GetMapping("/oftContain")//this oft home page
    public String showOft()
    {
    	return "dashcontain/oft";
    }
    
    @GetMapping("/fldGroundnut")//this oft home page
    public String showground()
    {
    	return "dashcontain/Groundnut";
    }
    
    @GetMapping("/fldTurmeric")//this oft home page
    public String showTurmeri()
    {
    	return "dashcontain/Turmeric";
    }
    
    @GetMapping("/fldOnion")//this oft home page
    public String showOnion()
    {
    	return "dashcontain/Onion";
    }
    
    @GetMapping("/fldgarlic")//this oft home page
    public String showgarlic()
    {
    	return "dashcontain/Garlic";
    }
    
    @GetMapping("/fldorange")//this oft home page
    public String showorange()
    {
    	return "dashcontain/Orange";
    }
    
    
    
}

