package com.fpoly.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fpoly.model.Users;

@Controller
public class LoginController {
    @GetMapping("login")
    public String login(Model model){
        Users user = new Users();
        user.setUsername("abc");
        user.setPassword("123");

        Users user1 = new Users();
        user1.setUsername("def");
        user1.setPassword("456");

        var users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        
        model.addAttribute("users", users);
        model.addAttribute("theDate", new java.util.Date());
        return "login";
    }

    @PostMapping("login")
    public String login(@ModelAttribute("loginBean") Users loginBean, Model model){
        if(loginBean.getUsername().equals("nguyevana") && 
        loginBean.getPassword().equals("12345")){
            model.addAttribute("username", loginBean.getUsername());
            return "welcome"; 
        }
        model.addAttribute("error","invalid user!");
        return "login";
    }
    
}
