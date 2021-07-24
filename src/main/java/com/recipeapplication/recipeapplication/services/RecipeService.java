package com.recipeapplication.recipeapplication.services;

import java.util.List;

import com.recipeapplication.recipeapplication.entities.Recipe;

public interface RecipeService {
   
	public List<Recipe> getRecipes();
	
	public Recipe getRecipe(long recipeId);
	
	public Recipe addRecipe(Recipe recipe);
	
	public Recipe updateRecipe(Recipe recipe);
	
	public void deleteRecipe(long recipeId);
}
