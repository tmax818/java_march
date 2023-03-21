package tyler.recipesmn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.recipesmn.models.Recipe;
import tyler.recipesmn.repositories.RecipeRepository;

@Service
public class RecipeService {

    @Autowired RecipeRepository recipeRepository;

    public void createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe getOneRecipe(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);
        return recipe.orElse(null);
    }

    public void updateRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public void destroyRecipe(Long id) {
        recipeRepository.deleteById(id);
    }
    
}
