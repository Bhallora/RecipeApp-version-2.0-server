package com.recipeapplication.recipeapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipeapplication.recipeapplication.dao.ShoppingListDao;
import com.recipeapplication.recipeapplication.entities.ShoppingList;
@Service
public class ShoppingListServiceImpl implements ShoppingListService {
	
	@Autowired
	private ShoppingListDao shoppingListDao;

	@Override
	public List<ShoppingList> getShoppingList() {
		return shoppingListDao.findAll();
	}

	@Override
	public ShoppingList getSingleItem(long itemId) {
		return shoppingListDao.findById(itemId).get();
	}

	@Override
	public List<ShoppingList> addItems(List<ShoppingList> items) {
		
		  shoppingListDao.saveAll(items);
		return items;
	}

	@Override
	public ShoppingList updateItem(ShoppingList item) {
		 shoppingListDao.save(item);
		return null;
	}

	@Override
	public void deleteItem(long itemId) {
	  ShoppingList item = shoppingListDao.getById(itemId);
	  shoppingListDao.delete(item);
		
	}

}
