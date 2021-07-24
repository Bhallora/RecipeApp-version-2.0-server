package com.recipeapplication.recipeapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipeapplication.recipeapplication.entities.Recipe;

public interface RecipeDao extends JpaRepository<Recipe, Long> {

}
