package com.recipes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.transferobject.Recipe;

@RestController
public class RecipeController {
    @GetMapping("/")
    public String index() {
        return "Recipe backend working!";
    }

    @GetMapping("/test")
    public Recipe testEndpoint() {
        return GetTestRecipe();
    }

    private Recipe GetTestRecipe() {
        Recipe r = new Recipe();
        r.id = 0L;
        r.name = "Pancakes";

        return r;
    }
    
}
