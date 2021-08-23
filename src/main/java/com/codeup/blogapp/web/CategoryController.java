package com.codeup.blogapp.web;

import com.codeup.blogapp.data.CategoriesRepository;
import com.codeup.blogapp.data.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/categories", headers = "application/json")
public class CategoryController {

    private final CategoriesRepository categoryRepository;

    public CategoryController(CategoriesRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @GetMapping
    private List<Category> getCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    private Category getPostsByCategory(@PathVariable Long id){

        return categoryRepository.getById(id);
    }
}
