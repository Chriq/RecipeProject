package com.recipes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.jpa.dao.RecipeDAO;
import com.recipes.transferobject.RecipeTO;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDAO dao;

    @GetMapping("/")
    public String index() {
        return "Recipe backend working!";
    }

    @GetMapping("/getAllRecipes")
    public List<RecipeTO> getAllRecipes() {
        try {
            return dao.getAllRecipes();
        } catch (Exception e) {
            List<RecipeTO> list = new ArrayList<>();
            list.add(GetTestRecipe());
            return list;
        }
    }

    @GetMapping("/test")
    public RecipeTO testEndpoint() {
        return GetTestRecipe();
    }

    private RecipeTO GetTestRecipe() {
        RecipeTO r = new RecipeTO();
        r.id = 0L;
        r.name = "Test Recipe";

        return r;
    }
    
}
