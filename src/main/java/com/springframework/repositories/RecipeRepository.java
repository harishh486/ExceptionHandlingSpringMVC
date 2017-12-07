package com.springframework.repositories;

import com.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Harish on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
