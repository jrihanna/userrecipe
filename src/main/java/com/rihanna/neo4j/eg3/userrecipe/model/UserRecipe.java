package com.rihanna.neo4j.eg3.userrecipe.model;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

import com.rihanna.neo4j.eg3.model.Ingredient;
import com.rihanna.neo4j.eg3.user.model.User;

import lombok.Getter;
import lombok.Setter;

@NodeEntity
@Getter
@Setter
public class UserRecipe {
	
	private User user;
	private List<Ingredient> likedIngredients;
	private List<Ingredient> dislikedIngredients;

}
