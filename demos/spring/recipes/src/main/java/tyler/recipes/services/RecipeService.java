package tyler.recipes.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.recipes.models.Recipe;
import tyler.recipes.repositories.RecipeRepository;

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
