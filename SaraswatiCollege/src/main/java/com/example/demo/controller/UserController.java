package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        return userService.loginUser(username, password);
    }
    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String email,
                               Model model) throws Exception {
    	userService.registerUser(username, password, email);
       
        return "login";
    	
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Loads register.html
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Loads login.html
    }
    @GetMapping("/index")
    public String getIndex()
    {
    	return "index";
    }
    
    @GetMapping("/mandates")
    public String getasa()
    {
    	return "mandates";
    }
    @GetMapping("/about")  // Loads about.html
    public String showAboutPage() {
        return "about"; // Looks for about.html inside templates/
    }
    @GetMapping("/operational")
    public String getteam()
    {
    	return "operational";
    }
    
    @GetMapping("/contact")
    public String getContact()
    {
    	return "contact";
    }
    @GetMapping("/location")
    public String getActivities()
    {
    	return "location";
    }
    @GetMapping("/silent")
    public String getsilent()
    {
    	return "silent";
    }
    @GetMapping("/training")
    public String gettraining()
    {
    	return "training";
    }
    @GetMapping("/front")
    public String getfront()
    {
    	return "front";
    }
    @GetMapping("/on farm")
    public String getonfarm()
    {
    	return "on farm";
    }
    @GetMapping("/extension")
    public String getextension()
    {
    	return "extension";
    }

    @GetMapping("/event1")
    public String geteventis()
    {
    	return "event1";
    }
    @GetMapping("/event2")
    public String geteventss()
    {
    	return "event2";
    }
    @GetMapping("/event3")
    public String geteventt()
    {
    	return "event3";
    }
    @GetMapping("/event4")
    public String getevents()
    {
    	return "event4";
    }
    @GetMapping("/event5")
    public String getevent()
    {
    	return "event5";
    }
    @GetMapping("/event6")
    public String geteventts()
    {
    	return "event6";
    }
    @GetMapping("/home")
    public String gethome()
    {
    	return "home";
    }
      
}
