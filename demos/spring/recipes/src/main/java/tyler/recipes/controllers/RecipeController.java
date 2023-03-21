package tyler.recipes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tyler.recipes.models.Recipe;
import tyler.recipes.services.RecipeService;

@Controller
public class RecipeController {

    @Autowired RecipeService recipeService;

    //! CREATE

    @GetMapping("/recipes/new")
    public String newRecipe(@ModelAttribute("recipe")Recipe recipe){
        return "recipes/new.jsp";
    }

    @PostMapping("/recipes")
    public String createRecipe(@Valid @ModelAttribute("recipe")Recipe recipe, BindingResult result){
        System.out.println(recipe);
        recipeService.createRecipe(recipe);
        return "redirect:/recipes";
    }
    
    //! READ ALL
    @GetMapping("/recipes")
    public String recipes(Model model){
        List<Recipe> recipes = recipeService.getAllRecipes();
        System.out.println(recipes);
        model.addAttribute("recipes", recipes);
        return "recipes/recipes.jsp";
    }


    //! READ ONE
    @GetMapping("/recipes/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Recipe recipe = recipeService.getOneRecipe(id);
        model.addAttribute("recipe", recipe);
        return "recipes/show.jsp";
    }
}
