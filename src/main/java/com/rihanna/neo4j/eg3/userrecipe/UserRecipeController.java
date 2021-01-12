package com.rihanna.neo4j.eg3.userrecipe;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rihanna.neo4j.eg3.model.Recipe;
import com.rihanna.neo4j.eg3.userrecipe.service.UserRecipeService;

@Controller
@RequestMapping("/userrecipe")
public class UserRecipeController {
	
	@Autowired
	UserRecipeService userRecipeService;

	@GetMapping
    public void getAll() {
    	userRecipeService.userLikesIngredient("Reihane", "Butter");
    }
}
