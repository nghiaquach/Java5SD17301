package com.fpoly.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpoly.dao.CategoryDAO;
import com.fpoly.model.Category;

@Controller
public class CategoryController {
 
    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping("/category/index")
    public String getCategories(Model model,@RequestParam("p") Optional<Integer> p) {
        
        var category = new Category();
        model.addAttribute("category", category);
     
        var numberOfRecords = categoryDAO.count();
        var numberOfPages = (int) Math.ceil(numberOfRecords / 5.0);
        model.addAttribute("numberOfPages", numberOfPages);
        Pageable sort = PageRequest.of(p.orElse(0), 5, Sort.by("name").ascending());
        model.addAttribute("currIndex", p.orElse(0));
        var categories = categoryDAO.findAll(sort);

        for (Category category2 : categories) {
            var products = category2.getProducts();
            System.out.println(category2.getName());
            System.out.println(products.size());
        }

        model.addAttribute("categories", categories);
            return "category/index";
    }

    @GetMapping("/category/page")
    public String paginate(Model model,@RequestParam("p") Optional<Integer> p){
        return this.getCategories(model, p);
    }

    @GetMapping("/category/save")
    public String saveCategory(@ModelAttribute("category") Category cat ,Model model) {
        categoryDAO.save(cat);
        return this.getCategories(model, Optional.empty());
    }
}
