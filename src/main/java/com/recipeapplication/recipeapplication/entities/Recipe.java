package com.recipeapplication.recipeapplication.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Recipe{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
	private long id;
	private String name;
	private String description;
	private String imagePath;
	
//	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	
	@OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_id")
	private List<Ingredient> ingredients = new ArrayList<>();

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
public Recipe(long id, String name, String description, String imagePath) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.imagePath = imagePath;
}



public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getImagePath() {
	return imagePath;
}

public void setImagePath(String imagePath) {
	this.imagePath = imagePath;
}

public List<Ingredient> getIngredients() {
	return ingredients;
}

public void setIngredients(List<Ingredient> ingredients) {
	this.ingredients.clear();
	if(ingredients != null) {
		this.ingredients.addAll(ingredients);
	}
}
	








	
	
	
	
}
