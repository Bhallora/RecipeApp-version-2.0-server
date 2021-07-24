package com.recipeapplication.recipeapplication.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipeapplication.recipeapplication.dao.RecipeDao;
import com.recipeapplication.recipeapplication.entities.Recipe;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeDao recipeDao;

	
	public RecipeServiceImpl() {
	}

	@Override
	public List<Recipe> getRecipes() {
		return recipeDao.findAll();
	}

	@Override
	public Recipe getRecipe(long recipeId) {

		return recipeDao.findById(recipeId).get();
	}

	@Override
	public Recipe addRecipe(Recipe recipe) {

		recipeDao.save(recipe);
		return recipe;
	}
	
    @Override
    public Recipe updateRecipe(Recipe recipe) {
    	recipeDao.save(recipe);
    	return recipe;
    }
    @Override
    public void deleteRecipe(long recipeId) {
    	Recipe recipe = recipeDao.getById(recipeId);
    	recipeDao.delete(recipe);
    }

}
