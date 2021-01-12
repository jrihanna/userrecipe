package com.rihanna.neo4j.eg3.userrecipe.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import com.rihanna.neo4j.eg3.model.Ingredient;
import com.rihanna.neo4j.eg3.user.model.User;
import com.rihanna.neo4j.eg3.userrecipe.model.UserRecipe;


@Repository
public interface UserRecipeRepository extends Neo4jRepository<UserRecipe, Long> {

	@Query("MATCH (a:User),(b:Ingredient) WHERE a.userName = $username AND b.name = $ingredientName "
			+ " CREATE (a)-[r:LIKES]->(b)")
	void userLikesIngrediend(String username, String ingredientName);
}
