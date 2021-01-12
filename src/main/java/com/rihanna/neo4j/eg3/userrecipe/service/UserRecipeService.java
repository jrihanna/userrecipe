package com.rihanna.neo4j.eg3.userrecipe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihanna.neo4j.eg3.model.Ingredient;
import com.rihanna.neo4j.eg3.user.model.User;
import com.rihanna.neo4j.eg3.userrecipe.repository.UserRecipeRepository;

@Service
public class UserRecipeService {
	
	@Autowired
	UserRecipeRepository userRecipeRepository;

	public void userLikesIngredient(String username, String ingredientName) {
		userRecipeRepository.userLikesIngrediend(username, ingredientName);
	}
}
