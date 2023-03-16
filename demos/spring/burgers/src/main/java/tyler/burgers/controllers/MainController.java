package tyler.burgers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tyler.burgers.models.Burger;
import tyler.burgers.services.BurgerService;

@Controller
public class MainController {
    
    @Autowired BurgerService burgerService;

    //! CREATE
    @GetMapping("/")
    public String index(@ModelAttribute("burger")Burger burger, Model model){
        List<Burger> burgers = burgerService.getAllBurgers();
        System.out.println(burgers);
        //! This is how the table get populated
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }

 

    @PostMapping("/burgers")
    public String createBurger(@ModelAttribute("burger")Burger burger){
        burgerService.createBurger(burger);
        return "redirect:/";
    }
}
