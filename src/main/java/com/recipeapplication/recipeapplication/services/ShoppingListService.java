
package com.recipeapplication.recipeapplication.services;

import java.util.List;

import com.recipeapplication.recipeapplication.entities.ShoppingList;

public interface ShoppingListService {
 
    public List<ShoppingList> getShoppingList();
	
	public ShoppingList getSingleItem(long itemId);
	
	public List<ShoppingList> addItems(List<ShoppingList> items);
	
	public ShoppingList updateItem(ShoppingList item);
	
	public void deleteItem(long itemId);
}
