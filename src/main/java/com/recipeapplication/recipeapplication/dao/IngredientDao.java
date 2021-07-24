package com.recipeapplication.recipeapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipeapplication.recipeapplication.entities.Ingredient;


public interface IngredientDao extends JpaRepository<Ingredient, Long> {

}
