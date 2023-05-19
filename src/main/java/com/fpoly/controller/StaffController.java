package com.fpoly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fpoly.model.Staff;

import jakarta.validation.Valid;

@Controller
public class StaffController {
    @GetMapping("staff")
    public String staff(Model model){
        Staff staff = new Staff();
        staff.setId("1");
        staff.setFullname("Nguyen Van A");
        staff.setSalary(5000000.0);
        staff.setEmail("NguyenVanA@gmail.com"); 
        model.addAttribute("staff", staff);
        return "staff";
    }

    @PostMapping("staff")
    public String staff(@Valid @ModelAttribute("staff") Staff staff, BindingResult result){
        if(result.hasErrors()){
            return "staff";
        }

        staff.setFullname(staff.getFullname().toUpperCase());
        return "staff";
    }
}
