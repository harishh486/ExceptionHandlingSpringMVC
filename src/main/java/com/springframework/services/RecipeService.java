package com.springframework.services;

import com.springframework.commands.RecipeCommand;
import com.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by Harish on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
