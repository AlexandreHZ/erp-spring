package com.erp.erpspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.erpspring.model.Category;
import com.erp.erpspring.repository.CategoryRepository;

@RestController
@RequestMapping("/api/category")
public class CategoriesController {

    private final CategoryRepository categoryRepository;

    public CategoriesController (CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
    
    @GetMapping
    public List<Category> listCategories() {
        return this.categoryRepository.findAll();
    }
}
