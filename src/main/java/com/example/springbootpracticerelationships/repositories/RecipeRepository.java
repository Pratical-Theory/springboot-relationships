package com.example.springbootpracticerelationships.repositories;

import com.example.springbootpracticerelationships.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
