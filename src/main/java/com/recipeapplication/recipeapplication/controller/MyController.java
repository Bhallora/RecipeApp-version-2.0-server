package com.recipeapplication.recipeapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.recipeapplication.recipeapplication.entities.Recipe;
import com.recipeapplication.recipeapplication.entities.ShoppingList;
import com.recipeapplication.recipeapplication.services.RecipeService;
import com.recipeapplication.recipeapplication.services.ShoppingListService;

@RestController
public class MyController {
	@Autowired
	private  RecipeService recipeService;
	@Autowired
	private ShoppingListService shoppingListService;
	
    final String corsUrl = "http://localhost:4200";
	
	@CrossOrigin(origins = corsUrl)
    @GetMapping("/recipes")
    public List<Recipe> getRecipes()
    {
    	return this.recipeService.getRecipes();
    }
	
	@CrossOrigin(origins = corsUrl)
    @RequestMapping(path ="/recipes/{recipeId}", method = RequestMethod.GET)
    public Recipe getRecipe(@PathVariable String recipeId)
    {
    	return this.recipeService.getRecipe(Long.parseLong(recipeId));
    }
    
	@CrossOrigin(origins = corsUrl)
    @PostMapping("/recipes")
    public Recipe addRecipe( @RequestBody Recipe recipe) {
    	return this.recipeService.addRecipe(recipe);
    }
    
	@CrossOrigin(origins = corsUrl)
    @PutMapping("/recipes")
    public Recipe updateRecipe( @RequestBody Recipe recipe) {
    	return this.recipeService.updateRecipe(recipe);
    }
    
	@CrossOrigin(origins = corsUrl)
    @DeleteMapping("/recipes/{recipeId}")
    public ResponseEntity<HttpStatus> deleteRecipe(@PathVariable String recipeId){
    	try {
    		this.recipeService.deleteRecipe(Long.parseLong(recipeId));
    		return new ResponseEntity<>(HttpStatus.OK);
    	}
    	catch(Exception e){
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
	
	
	@CrossOrigin(origins = corsUrl)
    @GetMapping("/shopping-list")
    public List<ShoppingList> getShoppingList()
    {
    	return this.shoppingListService.getShoppingList();
    }
	
	@CrossOrigin(origins = corsUrl)
    @RequestMapping(path ="/shopping-list/{itemId}", method = RequestMethod.GET)
    public ShoppingList getSingleItem(@PathVariable String itemId)
    {
    	return this.shoppingListService.getSingleItem(Long.parseLong(itemId));
    }
    
	@CrossOrigin(origins = corsUrl)
    @PostMapping("/shopping-list")
    public List<ShoppingList> addItems( @RequestBody List<ShoppingList> items) {
    	return this.shoppingListService.addItems(items);
    }
    
	@CrossOrigin(origins = corsUrl)
    @PutMapping("/shopping-list")
    public ShoppingList updateItem( @RequestBody ShoppingList item) {
    	return this.shoppingListService.updateItem(item);
    }
    
	@CrossOrigin(origins = corsUrl)
    @DeleteMapping("/shopping-list/{itemId}")
    public ResponseEntity<HttpStatus> deleteItem(@PathVariable String itemId){
    	try {
    		this.shoppingListService.deleteItem(Long.parseLong(itemId));
    		return new ResponseEntity<>(HttpStatus.OK);
    	}
    	catch(Exception e){
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
    
}
