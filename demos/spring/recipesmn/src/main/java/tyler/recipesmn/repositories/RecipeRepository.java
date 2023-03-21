package tyler.recipesmn.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import tyler.recipesmn.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    List<Recipe> findAll();
}
