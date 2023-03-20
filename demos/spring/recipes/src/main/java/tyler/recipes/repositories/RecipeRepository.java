package tyler.recipes.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tyler.recipes.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findAll();
}
