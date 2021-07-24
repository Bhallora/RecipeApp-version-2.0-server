package com.recipeapplication.recipeapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipeapplication.recipeapplication.entities.ShoppingList;

public interface ShoppingListDao extends JpaRepository<ShoppingList, Long>{

}
