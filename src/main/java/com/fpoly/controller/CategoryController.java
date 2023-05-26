package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpoly.dao.CategoryDAO;

@Controller
public class CategoryController {
 
    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping("/category/index")
    public String getCategories() {
        var categories = categoryDAO.findAll();
        return "category/index";
    }
}
