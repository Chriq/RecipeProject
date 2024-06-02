package com.recipes.transferobject;

import java.util.HashMap;

import lombok.Data;

@Data
public class RecipeTO {
    public Long id;
    public String name;
    public String description;
    public HashMap<String, String> ingredients;
    public String[] instructions;
}
